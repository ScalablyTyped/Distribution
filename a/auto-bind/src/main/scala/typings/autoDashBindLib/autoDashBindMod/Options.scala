package typings
package autoDashBindLib.autoDashBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Bind methods except for the given methods.
  		*/
  val exclude: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  /**
  		Bind only the given methods.
  		*/
  val include: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: js.Array[java.lang.String | stdLib.RegExp] = null,
    include: js.Array[java.lang.String | stdLib.RegExp] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[Options]
  }
}


package typings.autoDashBind.autoDashBindMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Bind methods except for the given methods.
  		*/
  val exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
  		Bind only the given methods.
  		*/
  val include: js.UndefOr[js.Array[String | RegExp]] = js.undefined
}

object Options {
  @scala.inline
  def apply(exclude: js.Array[String | RegExp] = null, include: js.Array[String | RegExp] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


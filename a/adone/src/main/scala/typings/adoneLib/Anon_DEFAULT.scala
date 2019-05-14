package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DEFAULT
  extends org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.utilNs.Editor]
     with org.scalablytyped.runtime.Instantiable1[
      /* options */ adoneLib.adoneNs.utilNs.INs.EditorOptions, 
      adoneLib.adoneNs.utilNs.Editor
    ] {
  var DEFAULT: java.lang.String = js.native
  def edit(): js.Promise[java.lang.String] = js.native
  def edit(options: adoneLib.adoneNs.utilNs.INs.EditorOptions): js.Promise[java.lang.String] = js.native
}

trait Anon_Default extends js.Object {
  var RFC1738: adoneLib.adoneLibStrings.RFC1738
  var RFC3986: adoneLib.adoneLibStrings.RFC3986
  var default: java.lang.String
  var formatters: Anon_RFC1738
}

object Anon_Default {
  @scala.inline
  def apply(
    RFC1738: adoneLib.adoneLibStrings.RFC1738,
    RFC3986: adoneLib.adoneLibStrings.RFC3986,
    default: java.lang.String,
    formatters: Anon_RFC1738
  ): Anon_Default = {
    val __obj = js.Dynamic.literal(RFC1738 = RFC1738, RFC3986 = RFC3986, default = default, formatters = formatters)
  
    __obj.asInstanceOf[Anon_Default]
  }
}


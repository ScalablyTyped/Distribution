package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_SiderHook extends js.Object {
  @JSName("siderHook")
  var siderHook_Original: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  def siderHook(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}


package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var Domain: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.domainNs.Domain]
  def create(): nodeLib.domainMod.Domain
}

object Anon_Create {
  @scala.inline
  def apply(
    Domain: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.domainNs.Domain],
    create: js.Function0[nodeLib.domainMod.Domain]
  ): Anon_Create = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Domain")(Domain)
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[Anon_Create]
  }
}


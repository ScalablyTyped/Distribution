package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdomain extends js.Object {
  var Domain: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.domainNs.Domain]
  def create(): nodeLib.domainMod.Domain
}

object Typeofdomain {
  @scala.inline
  def apply(
    Domain: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.domainNs.Domain],
    create: () => nodeLib.domainMod.Domain
  ): Typeofdomain = {
    val __obj = js.Dynamic.literal(Domain = Domain, create = js.Any.fromFunction0(create))
  
    __obj.asInstanceOf[Typeofdomain]
  }
}


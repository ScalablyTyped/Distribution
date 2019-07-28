package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.node.domainMod.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdomain extends js.Object {
  var Domain: Instantiable0[typings.adone.glossesStdMod.domainNs.Domain]
  def create(): Domain
}

object Typeofdomain {
  @scala.inline
  def apply(Domain: Instantiable0[typings.adone.glossesStdMod.domainNs.Domain], create: () => Domain): Typeofdomain = {
    val __obj = js.Dynamic.literal(Domain = Domain, create = js.Any.fromFunction0(create))
  
    __obj.asInstanceOf[Typeofdomain]
  }
}


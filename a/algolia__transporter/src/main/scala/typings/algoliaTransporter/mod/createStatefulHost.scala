package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/transporter", "createStatefulHost")
@js.native
object createStatefulHost extends js.Object {
  
  def apply(host: StatelessHost): StatefulHost = js.native
  def apply(host: StatelessHost, status: HostStatusType): StatefulHost = js.native
}

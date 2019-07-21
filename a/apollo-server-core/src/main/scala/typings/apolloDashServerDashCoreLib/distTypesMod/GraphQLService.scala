package typings
package apolloDashServerDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLService extends js.Object {
  def load(options: apolloDashServerDashCoreLib.Anon_Engine): js.Promise[GraphQLServiceConfig]
  def onSchemaChange(callback: SchemaChangeCallback): Unsubscriber
}

object GraphQLService {
  @scala.inline
  def apply(
    load: apolloDashServerDashCoreLib.Anon_Engine => js.Promise[GraphQLServiceConfig],
    onSchemaChange: SchemaChangeCallback => Unsubscriber
  ): GraphQLService = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), onSchemaChange = js.Any.fromFunction1(onSchemaChange))
  
    __obj.asInstanceOf[GraphQLService]
  }
}


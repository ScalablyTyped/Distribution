package typings.apolloDashServerDashCore.distTypesMod

import typings.apolloDashServerDashCore.Anon_Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLService extends js.Object {
  def load(options: Anon_Engine): js.Promise[GraphQLServiceConfig]
  def onSchemaChange(callback: SchemaChangeCallback): Unsubscriber
}

object GraphQLService {
  @scala.inline
  def apply(
    load: Anon_Engine => js.Promise[GraphQLServiceConfig],
    onSchemaChange: SchemaChangeCallback => Unsubscriber
  ): GraphQLService = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), onSchemaChange = js.Any.fromFunction1(onSchemaChange))
  
    __obj.asInstanceOf[GraphQLService]
  }
}


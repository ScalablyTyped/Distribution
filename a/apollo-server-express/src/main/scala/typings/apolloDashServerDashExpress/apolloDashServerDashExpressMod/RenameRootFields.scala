package typings.apolloDashServerDashExpress.apolloDashServerDashExpressMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashServerDashExpress.apolloDashServerDashExpressStrings.Mutation
import typings.apolloDashServerDashExpress.apolloDashServerDashExpressStrings.Query
import typings.apolloDashServerDashExpress.apolloDashServerDashExpressStrings.Subscription
import typings.graphql.typeDefinitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typings.graphqlDashTools.graphqlDashToolsMod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}


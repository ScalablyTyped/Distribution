package typings.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerExpress.apolloServerExpressStrings.Mutation
import typings.apolloServerExpress.apolloServerExpressStrings.Query
import typings.apolloServerExpress.apolloServerExpressStrings.Subscription
import typings.graphql.definitionMod.GraphQLFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typings.graphqlTools.mod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}


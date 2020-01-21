package typings.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServer.apolloServerStrings.Mutation
import typings.apolloServer.apolloServerStrings.Query
import typings.apolloServer.apolloServerStrings.Subscription
import typings.graphql.definitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typings.graphqlTools.mod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}


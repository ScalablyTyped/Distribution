package typings.apolloDashServer.apolloDashServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashServer.apolloDashServerStrings.Mutation
import typings.apolloDashServer.apolloDashServerStrings.Query
import typings.apolloDashServer.apolloDashServerStrings.Subscription
import typings.graphql.typeDefinitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typings.apolloDashServer.distExportsMod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}


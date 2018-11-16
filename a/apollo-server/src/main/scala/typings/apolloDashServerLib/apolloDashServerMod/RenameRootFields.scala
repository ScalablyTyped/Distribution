package typings
package apolloDashServerLib.apolloDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends apolloDashServerLib.distExportsMod.RenameRootFields {
  def this(renamer: js.Function3[
      /* operation */ apolloDashServerLib.apolloDashServerLibStrings.Query | apolloDashServerLib.apolloDashServerLibStrings.Mutation | apolloDashServerLib.apolloDashServerLibStrings.Subscription, 
      /* name */ java.lang.String, 
      /* field */ graphqlLib.typeDefinitionMod.GraphQLField[_, _, ScalablyTyped.runtime.StringDictionary[_]], 
      java.lang.String
    ]) = this()
}


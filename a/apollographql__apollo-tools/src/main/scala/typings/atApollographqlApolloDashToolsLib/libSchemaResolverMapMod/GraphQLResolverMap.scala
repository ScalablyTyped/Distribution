package typings
package atApollographqlApolloDashToolsLib.libSchemaResolverMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolverMap[TContext]
  extends /* typeName */ org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[
        (graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]]) | atApollographqlApolloDashToolsLib.Anon_ArgName[TContext]
      ]
    ]

object GraphQLResolverMap {
  @scala.inline
  def apply[TContext](
    StringDictionary: /* typeName */ org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[
        (graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]]) | atApollographqlApolloDashToolsLib.Anon_ArgName[TContext]
      ]
    ] = null
  ): GraphQLResolverMap[TContext] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GraphQLResolverMap[TContext]]
  }
}


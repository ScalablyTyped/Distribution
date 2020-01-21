package typings.apolloServer.exportsMod

import typings.graphqlTools.wrapQueryMod.QueryWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "WrapQuery")
@js.native
class WrapQuery protected ()
  extends typings.graphqlTools.mod.WrapQuery {
  def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
}


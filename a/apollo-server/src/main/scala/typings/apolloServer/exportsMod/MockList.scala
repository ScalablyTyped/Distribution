package typings.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "MockList")
@js.native
class MockList protected ()
  extends typings.graphqlTools.mod.MockList {
  def this(length: js.Array[Double]) = this()
  /**
    * @param length Either the exact length of items to return or an inclusive
    * range of possible lengths.
    * @param mockFunction The function to call for each item in the list to
    * resolve it. It can return another MockList or a value.
    */
  def this(length: Double) = this()
  def this(length: js.Array[Double], mockFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
  def this(length: Double, mockFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
}


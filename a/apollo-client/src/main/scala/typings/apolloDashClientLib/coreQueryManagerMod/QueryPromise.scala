package typings
package apolloDashClientLib.coreQueryManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryPromise extends js.Object {
  def reject(error: stdLib.Error): scala.Unit
  def resolve(result: apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]): scala.Unit
}


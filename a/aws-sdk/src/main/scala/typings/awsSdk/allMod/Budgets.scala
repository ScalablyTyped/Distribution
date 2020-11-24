package typings.awsSdk.allMod

import typings.awsSdk.budgetsMod.Budget
import typings.awsSdk.budgetsMod.ClientConfiguration
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/all", "Budgets")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Budgets () extends Array[Budget] {
  def this(options: ClientConfiguration) = this()
}

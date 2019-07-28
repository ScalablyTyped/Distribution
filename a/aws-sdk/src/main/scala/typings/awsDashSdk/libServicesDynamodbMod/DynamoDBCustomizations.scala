package typings.awsDashSdk.libServicesDynamodbMod

import org.scalablytyped.runtime.Instantiable1
import typings.awsDashSdk.clientsDynamodbMod.ClientConfiguration
import typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations")
@js.native
class DynamoDBCustomizations () extends Service

/* static members */
@JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations")
@js.native
object DynamoDBCustomizations extends js.Object {
  /**
    * The document client simplifies working with items in Amazon DynamoDB by abstracting away the notion of attribute values.
    * This abstraction annotates native JavaScript types supplied as input parameters, as well as converts annotated response data to native JavaScript types.
    */
  var DocumentClient: Instantiable1[
    js.UndefOr[/* options */ DocumentClientOptions with ClientConfiguration], 
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient
  ] = js.native
}


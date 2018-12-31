package typings
package awsDashSdkLib.libServicesDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations")
@js.native
class DynamoDBCustomizations ()
  extends awsDashSdkLib.libServiceMod.Service

@JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations")
@js.native
object DynamoDBCustomizations extends js.Object {
  /**
    * The document client simplifies working with items in Amazon DynamoDB by abstracting away the notion of attribute values.
    * This abstraction annotates native JavaScript types supplied as input parameters, as well as converts annotated response data to native JavaScript types.
    */
  var DocumentClient: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions with awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ClientConfiguration
    ], 
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClient
  ] = js.native
}


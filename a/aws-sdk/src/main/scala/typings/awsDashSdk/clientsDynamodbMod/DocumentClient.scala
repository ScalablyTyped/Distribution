package typings.awsDashSdk.clientsDynamodbMod

import typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.DocumentClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dynamodb", "DocumentClient")
@js.native
/**
  * Creates a DynamoDB document client with a set of configuration options.
  */
class DocumentClient ()
  extends typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient {
  def this(options: DocumentClientOptions with ClientConfiguration) = this()
}


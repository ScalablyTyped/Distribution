package typings.awsSdk.clientsDynamodbMod

import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DocumentClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/dynamodb", "DocumentClient")
@js.native
/**
  * Creates a DynamoDB document client with a set of configuration options.
  */
open class DocumentClient ()
  extends typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient {
  def this(options: DocumentClientOptions & ClientConfiguration) = this()
}

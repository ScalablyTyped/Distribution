package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSEDescription extends js.Object {
  /**
    * The KMS master key ARN used for the KMS encryption.
    */
  var KMSMasterKeyArn: js.UndefOr[KMSMasterKeyArn] = js.undefined
  /**
    * Server-side encryption type:    AES256 - Server-side encryption which uses the AES256 algorithm (not applicable).    KMS - Server-side encryption which uses AWS Key Management Service. Key is stored in your account and is managed by AWS KMS (KMS charges apply).  
    */
  var SSEType: js.UndefOr[SSEType] = js.undefined
  /**
    * The current state of server-side encryption:    ENABLING - Server-side encryption is being enabled.    ENABLED - Server-side encryption is enabled.    DISABLING - Server-side encryption is being disabled.    DISABLED - Server-side encryption is disabled.    UPDATING - Server-side encryption is being updated.  
    */
  var Status: js.UndefOr[SSEStatus] = js.undefined
}


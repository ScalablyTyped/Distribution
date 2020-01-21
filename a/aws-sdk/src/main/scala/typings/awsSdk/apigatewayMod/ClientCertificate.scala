package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCertificate extends js.Object {
  /**
    * The identifier of the client certificate.
    */
  var clientCertificateId: js.UndefOr[String] = js.native
  /**
    * The timestamp when the client certificate was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the client certificate.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The timestamp when the client certificate will expire.
    */
  var expirationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The PEM-encoded public key of the client certificate, which can be used to configure certificate authentication in the integration endpoint .
    */
  var pemEncodedCertificate: js.UndefOr[String] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
}

object ClientCertificate {
  @scala.inline
  def apply(
    clientCertificateId: String = null,
    createdDate: Timestamp = null,
    description: String = null,
    expirationDate: Timestamp = null,
    pemEncodedCertificate: String = null,
    tags: MapOfStringToString = null
  ): ClientCertificate = {
    val __obj = js.Dynamic.literal()
    if (clientCertificateId != null) __obj.updateDynamic("clientCertificateId")(clientCertificateId.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (pemEncodedCertificate != null) __obj.updateDynamic("pemEncodedCertificate")(pemEncodedCertificate.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificate]
  }
}


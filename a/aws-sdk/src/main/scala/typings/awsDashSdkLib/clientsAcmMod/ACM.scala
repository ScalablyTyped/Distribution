package typings
package awsDashSdkLib.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ACM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ACM: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAcmMod.ACMNs.ClientConfiguration = js.native
  /**
    * Adds one or more tags to an ACM certificate. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.  You can apply a tag to just one certificate if you want to identify a specific characteristic of that certificate, or you can apply the same tag to multiple certificates if you want to filter for a common relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to specify a relationship among those resources. For example, you can add the same tag to an ACM certificate and an Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more information, see Tagging ACM certificates.  To remove one or more tags, use the RemoveTagsFromCertificate action. To view all of the tags that have been applied to the certificate, use the ListTagsForCertificate action. 
    */
  def addTagsToCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to an ACM certificate. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.  You can apply a tag to just one certificate if you want to identify a specific characteristic of that certificate, or you can apply the same tag to multiple certificates if you want to filter for a common relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to specify a relationship among those resources. For example, you can add the same tag to an ACM certificate and an Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more information, see Tagging ACM certificates.  To remove one or more tags, use the RemoveTagsFromCertificate action. To view all of the tags that have been applied to the certificate, use the ListTagsForCertificate action. 
    */
  def addTagsToCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.AddTagsToCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.AddTagsToCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a certificate and its associated private key. If this action succeeds, the certificate no longer appears in the list that can be displayed by calling the ListCertificates action or be retrieved by calling the GetCertificate action. The certificate will not be available for use by AWS services integrated with ACM.   You cannot delete an ACM certificate that is being used by another AWS service. To delete a certificate that is in use, the certificate association must first be removed. 
    */
  def deleteCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a certificate and its associated private key. If this action succeeds, the certificate no longer appears in the list that can be displayed by calling the ListCertificates action or be retrieved by calling the GetCertificate action. The certificate will not be available for use by AWS services integrated with ACM.   You cannot delete an ACM certificate that is being used by another AWS service. To delete a certificate that is in use, the certificate association must first be removed. 
    */
  def deleteCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.DeleteCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.DeleteCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed metadata about the specified ACM certificate.
    */
  def describeCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed metadata about the specified ACM certificate.
    */
  def describeCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports a private certificate issued by a private certificate authority (CA) for use anywhere. You can export the certificate, the certificate chain, and the encrypted private key associated with the public key embedded in the certificate. You must store the private key securely. The private key is a 2048 bit RSA key. You must provide a passphrase for the private key when exporting it. You can use the following OpenSSL command to decrypt it later. Provide the passphrase when prompted.   openssl rsa -in encrypted_key.pem -out decrypted_key.pem 
    */
  def exportCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ExportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.ExportCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ExportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports a private certificate issued by a private certificate authority (CA) for use anywhere. You can export the certificate, the certificate chain, and the encrypted private key associated with the public key embedded in the certificate. You must store the private key securely. The private key is a 2048 bit RSA key. You must provide a passphrase for the private key when exporting it. You can use the following OpenSSL command to decrypt it later. Provide the passphrase when prompted.   openssl rsa -in encrypted_key.pem -out decrypted_key.pem 
    */
  def exportCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.ExportCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ExportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.ExportCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.ExportCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ExportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a certificate specified by an ARN and its certificate chain . The chain is an ordered list of certificates that contains the end entity certificate, intermediate certificates of subordinate CAs, and the root certificate in that order. The certificate and certificate chain are base64 encoded. If you want to decode the certificate to see the individual fields, you can use OpenSSL.
    */
  def getCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.GetCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a certificate specified by an ARN and its certificate chain . The chain is an ordered list of certificates that contains the end entity certificate, intermediate certificates of subordinate CAs, and the root certificate in that order. The certificate and certificate chain are base64 encoded. If you want to decode the certificate to see the individual fields, you can use OpenSSL.
    */
  def getCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.GetCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.GetCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.GetCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports a certificate into AWS Certificate Manager (ACM) to use with services that are integrated with ACM. Note that integrated services allow only certificate types and keys they support to be associated with their resources. Further, their support differs depending on whether the certificate is imported into IAM or into ACM. For more information, see the documentation for each service. For more information about importing certificates into ACM, see Importing Certificates in the AWS Certificate Manager User Guide.   ACM does not provide managed renewal for certificates that you import.  Note the following guidelines when importing third party certificates:   You must enter the private key that matches the certificate you are importing.   The private key must be unencrypted. You cannot import a private key that is protected by a password or a passphrase.   If the certificate you are importing is not self-signed, you must enter its certificate chain.   If a certificate chain is included, the issuer must be the subject of one of the certificates in the chain.   The certificate, private key, and certificate chain must be PEM-encoded.   The current time must be between the Not Before and Not After certificate fields.   The Issuer field must not be empty.   The OCSP authority URL, if present, must not exceed 1000 characters.   To import a new certificate, omit the CertificateArn argument. Include this argument only when you want to replace a previously imported certificate.   When you import a certificate by using the CLI, you must specify the certificate, the certificate chain, and the private key by their file names preceded by file://. For example, you can specify a certificate saved in the C:\temp folder as file://C:\temp\certificate_to_import.pem. If you are making an HTTP or HTTPS Query request, include these arguments as BLOBs.    When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the private key files in the manner required by the programming language you're using.    This operation returns the Amazon Resource Name (ARN) of the imported certificate.
    */
  def importCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ImportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.ImportCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ImportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports a certificate into AWS Certificate Manager (ACM) to use with services that are integrated with ACM. Note that integrated services allow only certificate types and keys they support to be associated with their resources. Further, their support differs depending on whether the certificate is imported into IAM or into ACM. For more information, see the documentation for each service. For more information about importing certificates into ACM, see Importing Certificates in the AWS Certificate Manager User Guide.   ACM does not provide managed renewal for certificates that you import.  Note the following guidelines when importing third party certificates:   You must enter the private key that matches the certificate you are importing.   The private key must be unencrypted. You cannot import a private key that is protected by a password or a passphrase.   If the certificate you are importing is not self-signed, you must enter its certificate chain.   If a certificate chain is included, the issuer must be the subject of one of the certificates in the chain.   The certificate, private key, and certificate chain must be PEM-encoded.   The current time must be between the Not Before and Not After certificate fields.   The Issuer field must not be empty.   The OCSP authority URL, if present, must not exceed 1000 characters.   To import a new certificate, omit the CertificateArn argument. Include this argument only when you want to replace a previously imported certificate.   When you import a certificate by using the CLI, you must specify the certificate, the certificate chain, and the private key by their file names preceded by file://. For example, you can specify a certificate saved in the C:\temp folder as file://C:\temp\certificate_to_import.pem. If you are making an HTTP or HTTPS Query request, include these arguments as BLOBs.    When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the private key files in the manner required by the programming language you're using.    This operation returns the Amazon Resource Name (ARN) of the imported certificate.
    */
  def importCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.ImportCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ImportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.ImportCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.ImportCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ImportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a specific status be listed. You can also filter by specific attributes of the certificate. 
    */
  def listCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ListCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.ListCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ListCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a specific status be listed. You can also filter by specific attributes of the certificate. 
    */
  def listCertificates(params: awsDashSdkLib.clientsAcmMod.ACMNs.ListCertificatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ListCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCertificates(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.ListCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.ListCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ListCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to specify the certificate. To add a tag to an ACM certificate, use the AddTagsToCertificate action. To delete a tag, use the RemoveTagsFromCertificate action. 
    */
  def listTagsForCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ListTagsForCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.ListTagsForCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ListTagsForCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to specify the certificate. To add a tag to an ACM certificate, use the AddTagsToCertificate action. To delete a tag, use the RemoveTagsFromCertificate action. 
    */
  def listTagsForCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.ListTagsForCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ListTagsForCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.ListTagsForCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.ListTagsForCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.ListTagsForCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Remove one or more tags from an ACM certificate. A tag consists of a key-value pair. If you do not specify the value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify a value, the tag is removed only if it is associated with the specified value.  To add tags to a certificate, use the AddTagsToCertificate action. To view all of the tags that have been applied to a specific ACM certificate, use the ListTagsForCertificate action. 
    */
  def removeTagsFromCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove one or more tags from an ACM certificate. A tag consists of a key-value pair. If you do not specify the value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify a value, the tag is removed only if it is associated with the specified value.  To add tags to a certificate, use the AddTagsToCertificate action. To view all of the tags that have been applied to a specific ACM certificate, use the ListTagsForCertificate action. 
    */
  def removeTagsFromCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.RemoveTagsFromCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.RemoveTagsFromCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Renews an eligable ACM certificate. At this time, only exported private certificates can be renewed with this operation. In order to renew your ACM PCA certificates with ACM, you must first grant the ACM service principal permission to do so. For more information, see Testing Managed Renewal in the ACM User Guide.
    */
  def renewCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def renewCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Renews an eligable ACM certificate. At this time, only exported private certificates can be renewed with this operation. In order to renew your ACM PCA certificates with ACM, you must first grant the ACM service principal permission to do so. For more information, see Testing Managed Renewal in the ACM User Guide.
    */
  def renewCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.RenewCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def renewCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.RenewCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Requests an ACM certificate for use with other AWS services. To request an ACM certificate, you must specify a fully qualified domain name (FQDN) in the DomainName parameter. You can also specify additional FQDNs in the SubjectAlternativeNames parameter.  If you are requesting a private certificate, domain validation is not required. If you are requesting a public certificate, each domain name that you specify must be validated to verify that you own or control the domain. You can use DNS validation or email validation. We recommend that you use DNS validation. ACM issues public certificates after receiving approval from the domain owner. 
    */
  def requestCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.RequestCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def requestCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.RequestCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.RequestCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests an ACM certificate for use with other AWS services. To request an ACM certificate, you must specify a fully qualified domain name (FQDN) in the DomainName parameter. You can also specify additional FQDNs in the SubjectAlternativeNames parameter.  If you are requesting a private certificate, domain validation is not required. If you are requesting a public certificate, each domain name that you specify must be validated to verify that you own or control the domain. You can use DNS validation or email validation. We recommend that you use DNS validation. ACM issues public certificates after receiving approval from the domain owner. 
    */
  def requestCertificate(params: awsDashSdkLib.clientsAcmMod.ACMNs.RequestCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.RequestCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def requestCertificate(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.RequestCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.RequestCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.RequestCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resends the email that requests domain ownership validation. The domain owner or an authorized representative must approve the ACM certificate before it can be issued. The certificate can be approved by clicking a link in the mail to navigate to the Amazon certificate approval website and then clicking I Approve. However, the validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can request that the mail be resent within 72 hours of requesting the ACM certificate. If more than 72 hours have elapsed since your original request or since your last attempt to resend validation mail, you must request a new certificate. For more information about setting up your contact email addresses, see Configure Email for your Domain. 
    */
  def resendValidationEmail(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resendValidationEmail(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resends the email that requests domain ownership validation. The domain owner or an authorized representative must approve the ACM certificate before it can be issued. The certificate can be approved by clicking a link in the mail to navigate to the Amazon certificate approval website and then clicking I Approve. However, the validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can request that the mail be resent within 72 hours of requesting the ACM certificate. If more than 72 hours have elapsed since your original request or since your last attempt to resend validation mail, you must request a new certificate. For more information about setting up your contact email addresses, see Configure Email for your Domain. 
    */
  def resendValidationEmail(params: awsDashSdkLib.clientsAcmMod.ACMNs.ResendValidationEmailRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resendValidationEmail(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.ResendValidationEmailRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a certificate. Currently, you can use this function to specify whether to opt in to or out of recording your certificate in a certificate transparency log. For more information, see  Opting Out of Certificate Transparency Logging. 
    */
  def updateCertificateOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCertificateOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a certificate. Currently, you can use this function to specify whether to opt in to or out of recording your certificate in a certificate transparency log. For more information, see  Opting Out of Certificate Transparency Logging. 
    */
  def updateCertificateOptions(params: awsDashSdkLib.clientsAcmMod.ACMNs.UpdateCertificateOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCertificateOptions(
    params: awsDashSdkLib.clientsAcmMod.ACMNs.UpdateCertificateOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the certificateValidated state by periodically calling the underlying ACM.describeCertificateoperation every 60 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_certificateValidated(state: awsDashSdkLib.awsDashSdkLibStrings.certificateValidated): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_certificateValidated(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateValidated,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the certificateValidated state by periodically calling the underlying ACM.describeCertificateoperation every 60 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_certificateValidated(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateValidated,
    params: awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_certificateValidated(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateValidated,
    params: awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmMod.ACMNs.DescribeCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}


package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/acmpca", "ACMPCA")
@js.native
object ACMPCANs extends js.Object {
  trait ASN1Subject extends js.Object {
    /**
      * Fully qualified domain name (FQDN) associated with the certificate subject.
      */
    var CommonName: js.UndefOr[String64] = js.undefined
    /**
      * Two-digit code that specifies the country in which the certificate subject located.
      */
    var Country: js.UndefOr[CountryCodeString] = js.undefined
    /**
      * Disambiguating information for the certificate subject.
      */
    var DistinguishedNameQualifier: js.UndefOr[DistinguishedNameQualifierString] = js.undefined
    /**
      * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
      */
    var GenerationQualifier: js.UndefOr[String3] = js.undefined
    /**
      * First name.
      */
    var GivenName: js.UndefOr[String16] = js.undefined
    /**
      * Concatenation that typically contains the first letter of the GivenName, the first letter of the middle name if one exists, and the first letter of the SurName.
      */
    var Initials: js.UndefOr[String5] = js.undefined
    /**
      * The locality (such as a city or town) in which the certificate subject is located.
      */
    var Locality: js.UndefOr[String128] = js.undefined
    /**
      * Legal name of the organization with which the certificate subject is affiliated. 
      */
    var Organization: js.UndefOr[String64] = js.undefined
    /**
      * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated.
      */
    var OrganizationalUnit: js.UndefOr[String64] = js.undefined
    /**
      * Typically a shortened version of a longer GivenName. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza.
      */
    var Pseudonym: js.UndefOr[String128] = js.undefined
    /**
      * The certificate serial number.
      */
    var SerialNumber: js.UndefOr[String64] = js.undefined
    /**
      * State in which the subject of the certificate is located.
      */
    var State: js.UndefOr[String128] = js.undefined
    /**
      * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first.
      */
    var Surname: js.UndefOr[String40] = js.undefined
    /**
      * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
      */
    var Title: js.UndefOr[String64] = js.undefined
  }
  
  trait CertificateAuthority extends js.Object {
    /**
      * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is  12345678-1234-1234-1234-123456789012 .
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * Your private CA configuration.
      */
    var CertificateAuthorityConfiguration: js.UndefOr[CertificateAuthorityConfiguration] = js.undefined
    /**
      * Date and time at which your private CA was created.
      */
    var CreatedAt: js.UndefOr[TStamp] = js.undefined
    /**
      * Reason the request to create your private CA failed.
      */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
      * Date and time at which your private CA was last updated.
      */
    var LastStateChangeAt: js.UndefOr[TStamp] = js.undefined
    /**
      * Date and time after which your private CA certificate is not valid.
      */
    var NotAfter: js.UndefOr[TStamp] = js.undefined
    /**
      * Date and time before which your private CA certificate is not valid.
      */
    var NotBefore: js.UndefOr[TStamp] = js.undefined
    /**
      * The period during which a deleted CA can be restored. For more information, see the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthorityRequest operation. 
      */
    var RestorableUntil: js.UndefOr[TStamp] = js.undefined
    /**
      * Information about the certificate revocation list (CRL) created and maintained by your private CA. 
      */
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined
    /**
      * Serial number of your private CA.
      */
    var Serial: js.UndefOr[String] = js.undefined
    /**
      * Status of your private CA.
      */
    var Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined
    /**
      * Type of your private CA.
      */
    var Type: js.UndefOr[CertificateAuthorityType] = js.undefined
  }
  
  trait CertificateAuthorityConfiguration extends js.Object {
    /**
      * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate.
      */
    var KeyAlgorithm: KeyAlgorithm
    /**
      * Name of the algorithm your private CA uses to sign certificate requests.
      */
    var SigningAlgorithm: SigningAlgorithm
    /**
      * Structure that contains X.500 distinguished name information for your private CA.
      */
    var Subject: ASN1Subject
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
    /**
      * Format in which to create the report. This can be either JSON or CSV.
      */
    var AuditReportResponseFormat: AuditReportResponseFormat
    /**
      * Amazon Resource Name (ARN) of the CA to be audited. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 .
      */
    var CertificateAuthorityArn: Arn
    /**
      * Name of the S3 bucket that will contain the audit report.
      */
    var S3BucketName: String
  }
  
  trait CreateCertificateAuthorityAuditReportResponse extends js.Object {
    /**
      * An alphanumeric string that contains a report identifier.
      */
    var AuditReportId: js.UndefOr[AuditReportId] = js.undefined
    /**
      * The key that uniquely identifies the report file in your S3 bucket.
      */
    var S3Key: js.UndefOr[String] = js.undefined
  }
  
  trait CreateCertificateAuthorityRequest extends js.Object {
    /**
      * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject information.
      */
    var CertificateAuthorityConfiguration: CertificateAuthorityConfiguration
    /**
      * The type of the certificate authority. Currently, this must be SUBORDINATE.
      */
    var CertificateAuthorityType: CertificateAuthorityType
    /**
      * Alphanumeric string that can be used to distinguish between calls to CreateCertificateAuthority. Idempotency tokens time out after five minutes. Therefore, if you call CreateCertificateAuthority multiple times with the same idempotency token within a five minute period, ACM PCA recognizes that you are requesting only one certificate. As a result, ACM PCA issues only one. If you change the idempotency token for each call, however, ACM PCA recognizes that you are requesting multiple certificates.
      */
    var IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined
    /**
      * Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the name of the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use to hide the name of your bucket in the CRL Distribution Points extension of your CA certificate. For more information, see the CrlConfiguration structure. 
      */
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined
    /**
      * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateCertificateAuthorityResponse extends js.Object {
    /**
      * If successful, the Amazon Resource Name (ARN) of the certificate authority (CA). This is of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
      */
    var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait CrlConfiguration extends js.Object {
    /**
      * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
      */
    var CustomCname: js.UndefOr[String253] = js.undefined
    /**
      * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to enable certificate revocation for a new CA when you call the CreateCertificateAuthority operation or for an existing CA when you call the UpdateCertificateAuthority operation. 
      */
    var Enabled: Boolean
    /**
      * Number of days until a certificate expires.
      */
    var ExpirationInDays: js.UndefOr[Integer1To5000] = js.undefined
    /**
      * Name of the S3 bucket that contains the CRL. If you do not provide a value for the CustomCname argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You can change the name of your bucket by calling the UpdateCertificateAuthority operation. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
      */
    var S3BucketName: js.UndefOr[String3To255] = js.undefined
  }
  
  trait DeleteCertificateAuthorityRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
      */
    var CertificateAuthorityArn: Arn
    /**
      * The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30 days, with 30 being the default.
      */
    var PermanentDeletionTimeInDays: js.UndefOr[PermanentDeletionTimeInDays] = js.undefined
  }
  
  trait DescribeCertificateAuthorityAuditReportRequest extends js.Object {
    /**
      * The report ID returned by calling the CreateCertificateAuthorityAuditReport operation.
      */
    var AuditReportId: AuditReportId
    /**
      * The Amazon Resource Name (ARN) of the private CA. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
      */
    var CertificateAuthorityArn: Arn
  }
  
  trait DescribeCertificateAuthorityAuditReportResponse extends js.Object {
    /**
      * Specifies whether report creation is in progress, has succeeded, or has failed.
      */
    var AuditReportStatus: js.UndefOr[AuditReportStatus] = js.undefined
    /**
      * The date and time at which the report was created.
      */
    var CreatedAt: js.UndefOr[TStamp] = js.undefined
    /**
      * Name of the S3 bucket that contains the report.
      */
    var S3BucketName: js.UndefOr[String] = js.undefined
    /**
      * S3 key that uniquely identifies the report file in your S3 bucket.
      */
    var S3Key: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeCertificateAuthorityRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
      */
    var CertificateAuthorityArn: Arn
  }
  
  trait DescribeCertificateAuthorityResponse extends js.Object {
    /**
      * A CertificateAuthority structure that contains information about your private CA.
      */
    var CertificateAuthority: js.UndefOr[CertificateAuthority] = js.undefined
  }
  
  trait GetCertificateAuthorityCertificateRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of your private CA. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
      */
    var CertificateAuthorityArn: Arn
  }
  
  trait GetCertificateAuthorityCertificateResponse extends js.Object {
    /**
      * Base64-encoded certificate authority (CA) certificate.
      */
    var Certificate: js.UndefOr[CertificateBody] = js.undefined
    /**
      * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. 
      */
    var CertificateChain: js.UndefOr[CertificateChain] = js.undefined
  }
  
  trait GetCertificateAuthorityCsrRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority operation. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
  }
  
  trait GetCertificateAuthorityCsrResponse extends js.Object {
    /**
      * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
      */
    var Csr: js.UndefOr[CsrBody] = js.undefined
  }
  
  trait GetCertificateRequest extends js.Object {
    /**
      * The ARN of the issued certificate. The ARN contains the certificate serial number and must be in the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/286535153982981100925020015808220737245  
      */
    var CertificateArn: Arn
    /**
      * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
      */
    var CertificateAuthorityArn: Arn
  }
  
  trait GetCertificateResponse extends js.Object {
    /**
      * The base64 PEM-encoded certificate specified by the CertificateArn parameter.
      */
    var Certificate: js.UndefOr[CertificateBody] = js.undefined
    /**
      * The base64 PEM-encoded certificate chain that chains up to the on-premises root CA certificate that you used to sign your private CA certificate. 
      */
    var CertificateChain: js.UndefOr[CertificateChain] = js.undefined
  }
  
  trait ImportCertificateAuthorityCertificateRequest extends js.Object {
    /**
      * The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
      */
    var Certificate: CertificateBodyBlob
    /**
      * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
    /**
      * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining up to your root CA. Your on-premises root certificate is the last in the chain, and each certificate in the chain signs the one preceding. 
      */
    var CertificateChain: CertificateChainBlob
  }
  
  trait IssueCertificateRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
    /**
      * The certificate signing request (CSR) for the certificate you want to issue. You can use the following OpenSSL command to create the CSR and a 2048 bit RSA private key.   openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr  If you have a configuration file, you can use the following OpenSSL command. The usr_cert block in the configuration file contains your X509 version 3 extensions.   openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr 
      */
    var Csr: CsrBlob
    /**
      * Custom string that can be used to distinguish between calls to the IssueCertificate operation. Idempotency tokens time out after one hour. Therefore, if you call IssueCertificate multiple times with the same idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency token for each call, PCA recognizes that you are requesting multiple certificates.
      */
    var IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined
    /**
      * The name of the algorithm that will be used to sign the certificate to be issued.
      */
    var SigningAlgorithm: SigningAlgorithm
    /**
      * The type of the validity period.
      */
    var Validity: Validity
  }
  
  trait IssueCertificateResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the issued certificate and the certificate serial number. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/286535153982981100925020015808220737245  
      */
    var CertificateArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait ListCertificateAuthoritiesRequest extends js.Object {
    /**
      * Use this parameter when paginating results to specify the maximum number of items to return in the response on each page. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Use this parameter when paginating results in a subsequent request after you receive a response with truncated results. Set it to the value of the NextToken parameter from the response you just received.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCertificateAuthoritiesResponse extends js.Object {
    /**
      * Summary information about each certificate authority you have created.
      */
    var CertificateAuthorities: js.UndefOr[CertificateAuthorities] = js.undefined
    /**
      * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListTagsRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority operation. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
    /**
      * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Use this parameter when paginating results in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListTagsResponse extends js.Object {
    /**
      * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The tags associated with your private CA.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait RestoreCertificateAuthorityRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority operation. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
  }
  
  trait RevocationConfiguration extends js.Object {
    /**
      * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
      */
    var CrlConfiguration: js.UndefOr[CrlConfiguration] = js.undefined
  }
  
  trait RevokeCertificateRequest extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
    /**
      * Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the serial number by calling GetCertificate with the Amazon Resource Name (ARN) of the certificate you want and the ARN of your private CA. The GetCertificate operation retrieves the certificate in the PEM format. You can use the following OpenSSL command to list the certificate in text format and copy the hexadecimal serial number.   openssl x509 -in file_path -text -noout  You can also copy the serial number from the console or use the DescribeCertificate operation in the AWS Certificate Manager API Reference. 
      */
    var CertificateSerial: String128
    /**
      * Specifies why you revoked the certificate.
      */
    var RevocationReason: RevocationReason
  }
  
  trait Tag extends js.Object {
    /**
      * Key (name) of the tag.
      */
    var Key: TagKey
    /**
      * Value of the tag.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagCertificateAuthorityRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
    /**
      * List of tags to be associated with the CA.
      */
    var Tags: TagList
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this operation returns the Amazon Resource Name (ARN) of the CA.
      */
    def createCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[CreateCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCertificateAuthority(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCertificateAuthorityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this operation returns the Amazon Resource Name (ARN) of the CA.
      */
    def createCertificateAuthority(params: CreateCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[CreateCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCertificateAuthority(
      params: CreateCertificateAuthorityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCertificateAuthorityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an audit report that lists every time that the your CA private key is used. The report is saved in the Amazon S3 bucket that you specify on input. The IssueCertificate and RevokeCertificate operations use the private key. You can generate a new report every 30 minutes.
      */
    def createCertificateAuthorityAuditReport(): awsDashSdkLib.libRequestMod.Request[CreateCertificateAuthorityAuditReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCertificateAuthorityAuditReport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCertificateAuthorityAuditReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCertificateAuthorityAuditReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an audit report that lists every time that the your CA private key is used. The report is saved in the Amazon S3 bucket that you specify on input. The IssueCertificate and RevokeCertificate operations use the private key. You can generate a new report every 30 minutes.
      */
    def createCertificateAuthorityAuditReport(params: CreateCertificateAuthorityAuditReportRequest): awsDashSdkLib.libRequestMod.Request[CreateCertificateAuthorityAuditReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCertificateAuthorityAuditReport(
      params: CreateCertificateAuthorityAuditReportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCertificateAuthorityAuditReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCertificateAuthorityAuditReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a private certificate authority (CA). You must provide the ARN (Amazon Resource Name) of the private CA that you want to delete. You can find the ARN by calling the ListCertificateAuthorities operation. Before you can delete a CA, you must disable it. Call the UpdateCertificateAuthority operation and set the CertificateAuthorityStatus parameter to DISABLED.  Additionally, you can delete a CA if you are waiting for it to be created (the Status field of the CertificateAuthority is CREATING). You can also delete it if the CA has been created but you haven't yet imported the signed certificate (the Status is PENDING_CERTIFICATE) into ACM PCA.  If the CA is in one of the aforementioned states and you call DeleteCertificateAuthority, the CA's status changes to DELETED. However, the CA won't be permentantly deleted until the restoration period has passed. By default, if you do not set the PermanentDeletionTimeInDays parameter, the CA remains restorable for 30 days. You can set the parameter from 7 to 30 days. The DescribeCertificateAuthority operation returns the time remaining in the restoration window of a Private CA in the DELETED state. To restore an eligable CA, call the RestoreCertificateAuthority operation.
      */
    def deleteCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCertificateAuthority(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a private certificate authority (CA). You must provide the ARN (Amazon Resource Name) of the private CA that you want to delete. You can find the ARN by calling the ListCertificateAuthorities operation. Before you can delete a CA, you must disable it. Call the UpdateCertificateAuthority operation and set the CertificateAuthorityStatus parameter to DISABLED.  Additionally, you can delete a CA if you are waiting for it to be created (the Status field of the CertificateAuthority is CREATING). You can also delete it if the CA has been created but you haven't yet imported the signed certificate (the Status is PENDING_CERTIFICATE) into ACM PCA.  If the CA is in one of the aforementioned states and you call DeleteCertificateAuthority, the CA's status changes to DELETED. However, the CA won't be permentantly deleted until the restoration period has passed. By default, if you do not set the PermanentDeletionTimeInDays parameter, the CA remains restorable for 30 days. You can set the parameter from 7 to 30 days. The DescribeCertificateAuthority operation returns the time remaining in the restoration window of a Private CA in the DELETED state. To restore an eligable CA, call the RestoreCertificateAuthority operation.
      */
    def deleteCertificateAuthority(params: DeleteCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCertificateAuthority(
      params: DeleteCertificateAuthorityRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:     CREATING - ACM PCA is creating your private certificate authority.    PENDING_CERTIFICATE - The certificate is pending. You must use your on-premises root or subordinate CA to sign your private CA CSR and then import it into PCA.     ACTIVE - Your private CA is active.    DISABLED - Your private CA has been disabled.    EXPIRED - Your private CA certificate has expired.    FAILED - Your private CA has failed. Your CA can fail because of problems such a network outage or backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.     DELETED - Your private CA is within the restoration period, after which it is permanently deleted. The length of time remaining in the CA's restoration period is also included in this operation's output.  
      */
    def describeCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[DescribeCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCertificateAuthority(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateAuthorityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:     CREATING - ACM PCA is creating your private certificate authority.    PENDING_CERTIFICATE - The certificate is pending. You must use your on-premises root or subordinate CA to sign your private CA CSR and then import it into PCA.     ACTIVE - Your private CA is active.    DISABLED - Your private CA has been disabled.    EXPIRED - Your private CA certificate has expired.    FAILED - Your private CA has failed. Your CA can fail because of problems such a network outage or backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.     DELETED - Your private CA is within the restoration period, after which it is permanently deleted. The length of time remaining in the CA's restoration period is also included in this operation's output.  
      */
    def describeCertificateAuthority(params: DescribeCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[DescribeCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCertificateAuthority(
      params: DescribeCertificateAuthorityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateAuthorityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about a specific audit report created by calling the CreateCertificateAuthorityAuditReport operation. Audit information is created every time the certificate authority (CA) private key is used. The private key is used when you call the IssueCertificate operation or the RevokeCertificate operation. 
      */
    def describeCertificateAuthorityAuditReport(): awsDashSdkLib.libRequestMod.Request[
        DescribeCertificateAuthorityAuditReportResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def describeCertificateAuthorityAuditReport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateAuthorityAuditReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeCertificateAuthorityAuditReportResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Lists information about a specific audit report created by calling the CreateCertificateAuthorityAuditReport operation. Audit information is created every time the certificate authority (CA) private key is used. The private key is used when you call the IssueCertificate operation or the RevokeCertificate operation. 
      */
    def describeCertificateAuthorityAuditReport(params: DescribeCertificateAuthorityAuditReportRequest): awsDashSdkLib.libRequestMod.Request[
        DescribeCertificateAuthorityAuditReportResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def describeCertificateAuthorityAuditReport(
      params: DescribeCertificateAuthorityAuditReportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateAuthorityAuditReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeCertificateAuthorityAuditReportResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the IssueCertificate operation. You must specify both the ARN of your private CA and the ARN of the issued certificate when calling the GetCertificate operation. You can retrieve the certificate if it is in the ISSUED state. You can call the CreateCertificateAuthorityAuditReport operation to create a report that contains information about all of the certificates issued and revoked by your private CA. 
      */
    def getCertificate(): awsDashSdkLib.libRequestMod.Request[GetCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the IssueCertificate operation. You must specify both the ARN of your private CA and the ARN of the issued certificate when calling the GetCertificate operation. You can retrieve the certificate if it is in the ISSUED state. You can call the CreateCertificateAuthorityAuditReport operation to create a report that contains information about all of the certificates issued and revoked by your private CA. 
      */
    def getCertificate(params: GetCertificateRequest): awsDashSdkLib.libRequestMod.Request[GetCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCertificate(
      params: GetCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the chain signs the one before it. 
      */
    def getCertificateAuthorityCertificate(): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCertificateAuthorityCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateAuthorityCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the chain signs the one before it. 
      */
    def getCertificateAuthorityCertificate(params: GetCertificateAuthorityCertificateRequest): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCertificateAuthorityCertificate(
      params: GetCertificateAuthorityCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateAuthorityCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created when you call the CreateCertificateAuthority operation. Take the CSR to your on-premises X.509 infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into ACM PCA by calling the ImportCertificateAuthorityCertificate operation. The CSR is returned as a base64 PEM-encoded string. 
      */
    def getCertificateAuthorityCsr(): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCertificateAuthorityCsr(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateAuthorityCsrResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created when you call the CreateCertificateAuthority operation. Take the CSR to your on-premises X.509 infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into ACM PCA by calling the ImportCertificateAuthorityCertificate operation. The CSR is returned as a base64 PEM-encoded string. 
      */
    def getCertificateAuthorityCsr(params: GetCertificateAuthorityCsrRequest): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCertificateAuthorityCsr(
      params: GetCertificateAuthorityCsrRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateAuthorityCsrResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Imports your signed private CA certificate into ACM PCA. Before you can call this operation, you must create the private certificate authority by calling the CreateCertificateAuthority operation. You must then generate a certificate signing request (CSR) by calling the GetCertificateAuthorityCsr operation. Take the CSR to your on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate chain and copy the signed certificate and the certificate chain to your working directory.   Your certificate chain must not include the private CA certificate that you are importing.   Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any, that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA must come next, and so on until your chain is built.    The chain must be PEM-encoded. 
      */
    def importCertificateAuthorityCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importCertificateAuthorityCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Imports your signed private CA certificate into ACM PCA. Before you can call this operation, you must create the private certificate authority by calling the CreateCertificateAuthority operation. You must then generate a certificate signing request (CSR) by calling the GetCertificateAuthorityCsr operation. Take the CSR to your on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate chain and copy the signed certificate and the certificate chain to your working directory.   Your certificate chain must not include the private CA certificate that you are importing.   Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any, that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA must come next, and so on until your chain is built.    The chain must be PEM-encoded. 
      */
    def importCertificateAuthorityCertificate(params: ImportCertificateAuthorityCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importCertificateAuthorityCertificate(
      params: ImportCertificateAuthorityCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uses your private certificate authority (CA) to issue a client certificate. This operation returns the Amazon Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the GetCertificate operation and specifying the ARN.   You cannot use the ACM ListCertificateAuthorities operation to retrieve the ARNs of the certificates that you issue by using ACM PCA. 
      */
    def issueCertificate(): awsDashSdkLib.libRequestMod.Request[IssueCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def issueCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IssueCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IssueCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uses your private certificate authority (CA) to issue a client certificate. This operation returns the Amazon Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the GetCertificate operation and specifying the ARN.   You cannot use the ACM ListCertificateAuthorities operation to retrieve the ARNs of the certificates that you issue by using ACM PCA. 
      */
    def issueCertificate(params: IssueCertificateRequest): awsDashSdkLib.libRequestMod.Request[IssueCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def issueCertificate(
      params: IssueCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IssueCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IssueCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the private certificate authorities that you created by using the CreateCertificateAuthority operation.
      */
    def listCertificateAuthorities(): awsDashSdkLib.libRequestMod.Request[ListCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCertificateAuthorities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCertificateAuthoritiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the private certificate authorities that you created by using the CreateCertificateAuthority operation.
      */
    def listCertificateAuthorities(params: ListCertificateAuthoritiesRequest): awsDashSdkLib.libRequestMod.Request[ListCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCertificateAuthorities(
      params: ListCertificateAuthoritiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCertificateAuthoritiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify and organize your CAs. Each tag consists of a key and an optional value. Call the TagCertificateAuthority operation to add one or more tags to your CA. Call the UntagCertificateAuthority operation to remove tags. 
      */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify and organize your CAs. Each tag consists of a key and an optional value. Call the TagCertificateAuthority operation to add one or more tags to your CA. Call the UntagCertificateAuthority operation to remove tags. 
      */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores a certificate authority (CA) that is in the DELETED state. You can restore a CA during the period that you defined in the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthority operation. Currently, you can specify 7 to 30 days. If you did not specify a PermanentDeletionTimeInDays value, by default you can restore the CA at any time in a 30 day period. You can check the time remaining in the restoration period of a private CA in the DELETED state by calling the DescribeCertificateAuthority or ListCertificateAuthorities operations. The status of a restored CA is set to its pre-deletion status when the RestoreCertificateAuthority operation returns. To change its status to ACTIVE, call the UpdateCertificateAuthority operation. If the private CA was in the PENDING_CERTIFICATE state at deletion, you must use the ImportCertificateAuthorityCertificate operation to import a certificate authority into the private CA before it can be activated. You cannot restore a CA after the restoration period has ended.
      */
    def restoreCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreCertificateAuthority(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores a certificate authority (CA) that is in the DELETED state. You can restore a CA during the period that you defined in the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthority operation. Currently, you can specify 7 to 30 days. If you did not specify a PermanentDeletionTimeInDays value, by default you can restore the CA at any time in a 30 day period. You can check the time remaining in the restoration period of a private CA in the DELETED state by calling the DescribeCertificateAuthority or ListCertificateAuthorities operations. The status of a restored CA is set to its pre-deletion status when the RestoreCertificateAuthority operation returns. To change its status to ACTIVE, call the UpdateCertificateAuthority operation. If the private CA was in the PENDING_CERTIFICATE state at deletion, you must use the ImportCertificateAuthorityCertificate operation to import a certificate authority into the private CA before it can be activated. You cannot restore a CA after the restoration period has ended.
      */
    def restoreCertificateAuthority(params: RestoreCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreCertificateAuthority(
      params: RestoreCertificateAuthorityRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes a certificate that you issued by calling the IssueCertificate operation. If you enable a certificate revocation list (CRL) when you create or update your private CA, information about the revoked certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more information about revocation, see the CrlConfiguration structure. ACM PCA also writes revocation information to the audit report. For more information, see CreateCertificateAuthorityAuditReport. 
      */
    def revokeCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes a certificate that you issued by calling the IssueCertificate operation. If you enable a certificate revocation list (CRL) when you create or update your private CA, information about the revoked certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more information about revocation, see the CrlConfiguration structure. ACM PCA also writes revocation information to the audit report. For more information, see CreateCertificateAuthorityAuditReport. 
      */
    def revokeCertificate(params: RevokeCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeCertificate(
      params: RevokeCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs if you want to filter for a common relationship among those CAs. To remove one or more tags, use the UntagCertificateAuthority operation. Call the ListTags operation to see what tags are associated with your CA. 
      */
    def tagCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagCertificateAuthority(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs if you want to filter for a common relationship among those CAs. To remove one or more tags, use the UntagCertificateAuthority operation. Call the ListTags operation to see what tags are associated with your CA. 
      */
    def tagCertificateAuthority(params: TagCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagCertificateAuthority(
      params: TagCertificateAuthorityRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value portion of the tag when calling this operation, the tag will be removed regardless of value. If you specify a value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the TagCertificateAuthority. Call the ListTags operation to see what tags are associated with your CA. 
      */
    def untagCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagCertificateAuthority(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value portion of the tag when calling this operation, the tag will be removed regardless of value. If you specify a value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the TagCertificateAuthority. Call the ListTags operation to see what tags are associated with your CA. 
      */
    def untagCertificateAuthority(params: UntagCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagCertificateAuthority(
      params: UntagCertificateAuthorityRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the ACTIVE or DISABLED state before you can update it. You can disable a private CA that is in the ACTIVE state or make a CA that is in the DISABLED state active again.
      */
    def updateCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCertificateAuthority(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the ACTIVE or DISABLED state before you can update it. You can disable a private CA that is in the ACTIVE state or make a CA that is in the DISABLED state active again.
      */
    def updateCertificateAuthority(params: UpdateCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCertificateAuthority(
      params: UpdateCertificateAuthorityRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the auditReportCreated state by periodically calling the underlying ACMPCA.describeCertificateAuthorityAuditReportoperation every 3 seconds (at most 60 times). Wait until a Audit Report is created
      */
    @JSName("waitFor")
    def waitFor_auditReportCreated(state: awsDashSdkLib.awsDashSdkLibStrings.auditReportCreated): awsDashSdkLib.libRequestMod.Request[
        DescribeCertificateAuthorityAuditReportResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    @JSName("waitFor")
    def waitFor_auditReportCreated(
      state: awsDashSdkLib.awsDashSdkLibStrings.auditReportCreated,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateAuthorityAuditReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeCertificateAuthorityAuditReportResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Waits for the auditReportCreated state by periodically calling the underlying ACMPCA.describeCertificateAuthorityAuditReportoperation every 3 seconds (at most 60 times). Wait until a Audit Report is created
      */
    @JSName("waitFor")
    def waitFor_auditReportCreated(
      state: awsDashSdkLib.awsDashSdkLibStrings.auditReportCreated,
      params: DescribeCertificateAuthorityAuditReportRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeCertificateAuthorityAuditReportResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    @JSName("waitFor")
    def waitFor_auditReportCreated(
      state: awsDashSdkLib.awsDashSdkLibStrings.auditReportCreated,
      params: DescribeCertificateAuthorityAuditReportRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateAuthorityAuditReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeCertificateAuthorityAuditReportResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Waits for the certificateAuthorityCSRCreated state by periodically calling the underlying ACMPCA.getCertificateAuthorityCsroperation every 3 seconds (at most 60 times). Wait until a Certificate Authority CSR is created
      */
    @JSName("waitFor")
    def waitFor_certificateAuthorityCSRCreated(state: awsDashSdkLib.awsDashSdkLibStrings.certificateAuthorityCSRCreated): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_certificateAuthorityCSRCreated(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateAuthorityCSRCreated,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateAuthorityCsrResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the certificateAuthorityCSRCreated state by periodically calling the underlying ACMPCA.getCertificateAuthorityCsroperation every 3 seconds (at most 60 times). Wait until a Certificate Authority CSR is created
      */
    @JSName("waitFor")
    def waitFor_certificateAuthorityCSRCreated(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateAuthorityCSRCreated,
      params: GetCertificateAuthorityCsrRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_certificateAuthorityCSRCreated(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateAuthorityCSRCreated,
      params: GetCertificateAuthorityCsrRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateAuthorityCsrResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateAuthorityCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the certificateIssued state by periodically calling the underlying ACMPCA.getCertificateoperation every 3 seconds (at most 60 times). Wait until a certificate is issued
      */
    @JSName("waitFor")
    def waitFor_certificateIssued(state: awsDashSdkLib.awsDashSdkLibStrings.certificateIssued): awsDashSdkLib.libRequestMod.Request[GetCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_certificateIssued(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateIssued,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the certificateIssued state by periodically calling the underlying ACMPCA.getCertificateoperation every 3 seconds (at most 60 times). Wait until a certificate is issued
      */
    @JSName("waitFor")
    def waitFor_certificateIssued(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateIssued,
      params: GetCertificateRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_certificateIssued(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateIssued,
      params: GetCertificateRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagCertificateAuthorityRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
    /**
      * List of tags to be removed from the CA.
      */
    var Tags: TagList
  }
  
  trait UpdateCertificateAuthorityRequest extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
      */
    var CertificateAuthorityArn: Arn
    /**
      * Revocation information for your private CA.
      */
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined
    /**
      * Status of your private CA.
      */
    var Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined
  }
  
  trait Validity extends js.Object {
    /**
      * Specifies whether the Value parameter represents days, months, or years.
      */
    var Type: ValidityPeriodType
    /**
      * Time period.
      */
    var Value: PositiveLong
  }
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type AuditReportId = java.lang.String
  type AuditReportResponseFormat = awsDashSdkLib.awsDashSdkLibStrings.JSON | awsDashSdkLib.awsDashSdkLibStrings.CSV | java.lang.String
  type AuditReportStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type Boolean = scala.Boolean
  type CertificateAuthorities = js.Array[CertificateAuthority]
  type CertificateAuthorityStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.PENDING_CERTIFICATE | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.EXPIRED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type CertificateAuthorityType = awsDashSdkLib.awsDashSdkLibStrings.SUBORDINATE | java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmpcaMod.Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmpcaMod.Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CountryCodeString = java.lang.String
  type CsrBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmpcaMod.Blob | java.lang.String
  type CsrBody = java.lang.String
  type DistinguishedNameQualifierString = java.lang.String
  type FailureReason = awsDashSdkLib.awsDashSdkLibStrings.REQUEST_TIMED_OUT | awsDashSdkLib.awsDashSdkLibStrings.UNSUPPORTED_ALGORITHM | awsDashSdkLib.awsDashSdkLibStrings.OTHER | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer1To5000 = scala.Double
  type KeyAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.RSA_2048 | awsDashSdkLib.awsDashSdkLibStrings.RSA_4096 | awsDashSdkLib.awsDashSdkLibStrings.EC_prime256v1 | awsDashSdkLib.awsDashSdkLibStrings.EC_secp384r1 | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PermanentDeletionTimeInDays = scala.Double
  type PositiveLong = scala.Double
  type RevocationReason = awsDashSdkLib.awsDashSdkLibStrings.UNSPECIFIED | awsDashSdkLib.awsDashSdkLibStrings.KEY_COMPROMISE | awsDashSdkLib.awsDashSdkLibStrings.CERTIFICATE_AUTHORITY_COMPROMISE | awsDashSdkLib.awsDashSdkLibStrings.AFFILIATION_CHANGED | awsDashSdkLib.awsDashSdkLibStrings.SUPERSEDED | awsDashSdkLib.awsDashSdkLibStrings.CESSATION_OF_OPERATION | awsDashSdkLib.awsDashSdkLibStrings.PRIVILEGE_WITHDRAWN | awsDashSdkLib.awsDashSdkLibStrings.A_A_COMPROMISE | java.lang.String
  type SigningAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.SHA256WITHECDSA | awsDashSdkLib.awsDashSdkLibStrings.SHA384WITHECDSA | awsDashSdkLib.awsDashSdkLibStrings.SHA512WITHECDSA | awsDashSdkLib.awsDashSdkLibStrings.SHA256WITHRSA | awsDashSdkLib.awsDashSdkLibStrings.SHA384WITHRSA | awsDashSdkLib.awsDashSdkLibStrings.SHA512WITHRSA | java.lang.String
  type String = java.lang.String
  type String128 = java.lang.String
  type String16 = java.lang.String
  type String253 = java.lang.String
  type String3 = java.lang.String
  type String3To255 = java.lang.String
  type String40 = java.lang.String
  type String5 = java.lang.String
  type String64 = java.lang.String
  type TStamp = stdLib.Date
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type ValidityPeriodType = awsDashSdkLib.awsDashSdkLibStrings.END_DATE | awsDashSdkLib.awsDashSdkLibStrings.ABSOLUTE | awsDashSdkLib.awsDashSdkLibStrings.DAYS | awsDashSdkLib.awsDashSdkLibStrings.MONTHS | awsDashSdkLib.awsDashSdkLibStrings.YEARS | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-08-22` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}


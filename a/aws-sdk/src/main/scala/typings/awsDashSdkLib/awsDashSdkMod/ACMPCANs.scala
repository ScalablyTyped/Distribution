package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "ACMPCA")
@js.native
object ACMPCANs extends js.Object {
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Types ()
    extends awsDashSdkLib.clientsAllMod.ACMPCANs.Types {
    def this(options: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
  @JSName("ACMPCA")
  @js.native
  object ACMPCANs extends js.Object {
    trait ASN1Subject extends js.Object {
      /**
        * Fully qualified domain name (FQDN) associated with the certificate subject.
        */
      var CommonName: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String64] = js.undefined
      /**
        * Two-digit code that specifies the country in which the certificate subject located.
        */
      var Country: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CountryCodeString] = js.undefined
      /**
        * Disambiguating information for the certificate subject.
        */
      var DistinguishedNameQualifier: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DistinguishedNameQualifierString] = js.undefined
      /**
        * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
        */
      var GenerationQualifier: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String3] = js.undefined
      /**
        * First name.
        */
      var GivenName: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String16] = js.undefined
      /**
        * Concatenation that typically contains the first letter of the GivenName, the first letter of the middle name if one exists, and the first letter of the SurName.
        */
      var Initials: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String5] = js.undefined
      /**
        * The locality (such as a city or town) in which the certificate subject is located.
        */
      var Locality: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String128] = js.undefined
      /**
        * Legal name of the organization with which the certificate subject is affiliated. 
        */
      var Organization: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String64] = js.undefined
      /**
        * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated.
        */
      var OrganizationalUnit: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String64] = js.undefined
      /**
        * Typically a shortened version of a longer GivenName. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza.
        */
      var Pseudonym: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String128] = js.undefined
      /**
        * The certificate serial number.
        */
      var SerialNumber: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String64] = js.undefined
      /**
        * State in which the subject of the certificate is located.
        */
      var State: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String128] = js.undefined
      /**
        * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first.
        */
      var Surname: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String40] = js.undefined
      /**
        * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
        */
      var Title: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String64] = js.undefined
    }
    
    trait CertificateAuthority extends js.Object {
      /**
        * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is  12345678-1234-1234-1234-123456789012 .
        */
      var Arn: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn] = js.undefined
      /**
        * Your private CA configuration.
        */
      var CertificateAuthorityConfiguration: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthorityConfiguration] = js.undefined
      /**
        * Date and time at which your private CA was created.
        */
      var CreatedAt: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TStamp] = js.undefined
      /**
        * Reason the request to create your private CA failed.
        */
      var FailureReason: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.FailureReason] = js.undefined
      /**
        * Date and time at which your private CA was last updated.
        */
      var LastStateChangeAt: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TStamp] = js.undefined
      /**
        * Date and time after which your private CA certificate is not valid.
        */
      var NotAfter: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TStamp] = js.undefined
      /**
        * Date and time before which your private CA certificate is not valid.
        */
      var NotBefore: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TStamp] = js.undefined
      /**
        * The period during which a deleted CA can be restored. For more information, see the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthorityRequest operation. 
        */
      var RestorableUntil: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TStamp] = js.undefined
      /**
        * Information about the certificate revocation list (CRL) created and maintained by your private CA. 
        */
      var RevocationConfiguration: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.RevocationConfiguration] = js.undefined
      /**
        * Serial number of your private CA.
        */
      var Serial: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String] = js.undefined
      /**
        * Status of your private CA.
        */
      var Status: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthorityStatus] = js.undefined
      /**
        * Type of your private CA.
        */
      var Type: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthorityType] = js.undefined
    }
    
    trait CertificateAuthorityConfiguration extends js.Object {
      /**
        * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate.
        */
      var KeyAlgorithm: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.KeyAlgorithm
      /**
        * Name of the algorithm your private CA uses to sign certificate requests.
        */
      var SigningAlgorithm: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.SigningAlgorithm
      /**
        * Structure that contains X.500 distinguished name information for your private CA.
        */
      var Subject: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ASN1Subject
    }
    
    trait ClientApiVersions extends js.Object {
      /**
        * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
        */
      var apiVersion: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.apiVersion] = js.undefined
    }
    
    trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
      /**
        * Format in which to create the report. This can be either JSON or CSV.
        */
      var AuditReportResponseFormat: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.AuditReportResponseFormat
      /**
        * Amazon Resource Name (ARN) of the CA to be audited. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 .
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * Name of the S3 bucket that will contain the audit report.
        */
      var S3BucketName: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String
    }
    
    trait CreateCertificateAuthorityAuditReportResponse extends js.Object {
      /**
        * An alphanumeric string that contains a report identifier.
        */
      var AuditReportId: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.AuditReportId] = js.undefined
      /**
        * The key that uniquely identifies the report file in your S3 bucket.
        */
      var S3Key: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String] = js.undefined
    }
    
    trait CreateCertificateAuthorityRequest extends js.Object {
      /**
        * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject information.
        */
      var CertificateAuthorityConfiguration: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthorityConfiguration
      /**
        * The type of the certificate authority. Currently, this must be SUBORDINATE.
        */
      var CertificateAuthorityType: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthorityType
      /**
        * Alphanumeric string that can be used to distinguish between calls to CreateCertificateAuthority. Idempotency tokens time out after five minutes. Therefore, if you call CreateCertificateAuthority multiple times with the same idempotency token within a five minute period, ACM PCA recognizes that you are requesting only one certificate. As a result, ACM PCA issues only one. If you change the idempotency token for each call, however, ACM PCA recognizes that you are requesting multiple certificates.
        */
      var IdempotencyToken: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IdempotencyToken] = js.undefined
      /**
        * Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the name of the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use to hide the name of your bucket in the CRL Distribution Points extension of your CA certificate. For more information, see the CrlConfiguration structure. 
        */
      var RevocationConfiguration: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.RevocationConfiguration] = js.undefined
      /**
        * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA.
        */
      var Tags: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TagList] = js.undefined
    }
    
    trait CreateCertificateAuthorityResponse extends js.Object {
      /**
        * If successful, the Amazon Resource Name (ARN) of the certificate authority (CA). This is of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
        */
      var CertificateAuthorityArn: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn] = js.undefined
    }
    
    trait CrlConfiguration extends js.Object {
      /**
        * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
        */
      var CustomCname: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String253] = js.undefined
      /**
        * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to enable certificate revocation for a new CA when you call the CreateCertificateAuthority operation or for an existing CA when you call the UpdateCertificateAuthority operation. 
        */
      var Enabled: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Boolean
      /**
        * Number of days until a certificate expires.
        */
      var ExpirationInDays: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Integer1To5000] = js.undefined
      /**
        * Name of the S3 bucket that contains the CRL. If you do not provide a value for the CustomCname argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You can change the name of your bucket by calling the UpdateCertificateAuthority operation. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
        */
      var S3BucketName: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String3To255] = js.undefined
    }
    
    trait DeleteCertificateAuthorityRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30 days, with 30 being the default.
        */
      var PermanentDeletionTimeInDays: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.PermanentDeletionTimeInDays] = js.undefined
    }
    
    trait DescribeCertificateAuthorityAuditReportRequest extends js.Object {
      /**
        * The report ID returned by calling the CreateCertificateAuthorityAuditReport operation.
        */
      var AuditReportId: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.AuditReportId
      /**
        * The Amazon Resource Name (ARN) of the private CA. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
    }
    
    trait DescribeCertificateAuthorityAuditReportResponse extends js.Object {
      /**
        * Specifies whether report creation is in progress, has succeeded, or has failed.
        */
      var AuditReportStatus: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.AuditReportStatus] = js.undefined
      /**
        * The date and time at which the report was created.
        */
      var CreatedAt: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TStamp] = js.undefined
      /**
        * Name of the S3 bucket that contains the report.
        */
      var S3BucketName: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String] = js.undefined
      /**
        * S3 key that uniquely identifies the report file in your S3 bucket.
        */
      var S3Key: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String] = js.undefined
    }
    
    trait DescribeCertificateAuthorityRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
    }
    
    trait DescribeCertificateAuthorityResponse extends js.Object {
      /**
        * A CertificateAuthority structure that contains information about your private CA.
        */
      var CertificateAuthority: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthority] = js.undefined
    }
    
    trait GetCertificateAuthorityCertificateRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) of your private CA. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
    }
    
    trait GetCertificateAuthorityCertificateResponse extends js.Object {
      /**
        * Base64-encoded certificate authority (CA) certificate.
        */
      var Certificate: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateBody] = js.undefined
      /**
        * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. 
        */
      var CertificateChain: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateChain] = js.undefined
    }
    
    trait GetCertificateAuthorityCsrRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority operation. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
    }
    
    trait GetCertificateAuthorityCsrResponse extends js.Object {
      /**
        * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
        */
      var Csr: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CsrBody] = js.undefined
    }
    
    trait GetCertificateRequest extends js.Object {
      /**
        * The ARN of the issued certificate. The ARN contains the certificate serial number and must be in the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/286535153982981100925020015808220737245  
        */
      var CertificateArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
    }
    
    trait GetCertificateResponse extends js.Object {
      /**
        * The base64 PEM-encoded certificate specified by the CertificateArn parameter.
        */
      var Certificate: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateBody] = js.undefined
      /**
        * The base64 PEM-encoded certificate chain that chains up to the on-premises root CA certificate that you used to sign your private CA certificate. 
        */
      var CertificateChain: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateChain] = js.undefined
    }
    
    trait ImportCertificateAuthorityCertificateRequest extends js.Object {
      /**
        * The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
        */
      var Certificate: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateBodyBlob
      /**
        * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining up to your root CA. Your on-premises root certificate is the last in the chain, and each certificate in the chain signs the one preceding. 
        */
      var CertificateChain: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateChainBlob
    }
    
    trait IssueCertificateRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * The certificate signing request (CSR) for the certificate you want to issue. You can use the following OpenSSL command to create the CSR and a 2048 bit RSA private key.   openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr  If you have a configuration file, you can use the following OpenSSL command. The usr_cert block in the configuration file contains your X509 version 3 extensions.   openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr 
        */
      var Csr: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CsrBlob
      /**
        * Custom string that can be used to distinguish between calls to the IssueCertificate operation. Idempotency tokens time out after one hour. Therefore, if you call IssueCertificate multiple times with the same idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency token for each call, PCA recognizes that you are requesting multiple certificates.
        */
      var IdempotencyToken: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IdempotencyToken] = js.undefined
      /**
        * The name of the algorithm that will be used to sign the certificate to be issued.
        */
      var SigningAlgorithm: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.SigningAlgorithm
      /**
        * The type of the validity period.
        */
      var Validity: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Validity
    }
    
    trait IssueCertificateResponse extends js.Object {
      /**
        * The Amazon Resource Name (ARN) of the issued certificate and the certificate serial number. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/286535153982981100925020015808220737245  
        */
      var CertificateArn: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn] = js.undefined
    }
    
    trait ListCertificateAuthoritiesRequest extends js.Object {
      /**
        * Use this parameter when paginating results to specify the maximum number of items to return in the response on each page. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
        */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.MaxResults] = js.undefined
      /**
        * Use this parameter when paginating results in a subsequent request after you receive a response with truncated results. Set it to the value of the NextToken parameter from the response you just received.
        */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.NextToken] = js.undefined
    }
    
    trait ListCertificateAuthoritiesResponse extends js.Object {
      /**
        * Summary information about each certificate authority you have created.
        */
      var CertificateAuthorities: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthorities] = js.undefined
      /**
        * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request.
        */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.NextToken] = js.undefined
    }
    
    trait ListTagsRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority operation. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
        */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.MaxResults] = js.undefined
      /**
        * Use this parameter when paginating results in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
        */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.NextToken] = js.undefined
    }
    
    trait ListTagsResponse extends js.Object {
      /**
        * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request. 
        */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.NextToken] = js.undefined
      /**
        * The tags associated with your private CA.
        */
      var Tags: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TagList] = js.undefined
    }
    
    trait RestoreCertificateAuthorityRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority operation. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
    }
    
    trait RevocationConfiguration extends js.Object {
      /**
        * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
        */
      var CrlConfiguration: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CrlConfiguration] = js.undefined
    }
    
    trait RevokeCertificateRequest extends js.Object {
      /**
        * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the serial number by calling GetCertificate with the Amazon Resource Name (ARN) of the certificate you want and the ARN of your private CA. The GetCertificate operation retrieves the certificate in the PEM format. You can use the following OpenSSL command to list the certificate in text format and copy the hexadecimal serial number.   openssl x509 -in file_path -text -noout  You can also copy the serial number from the console or use the DescribeCertificate operation in the AWS Certificate Manager API Reference. 
        */
      var CertificateSerial: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.String128
      /**
        * Specifies why you revoked the certificate.
        */
      var RevocationReason: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.RevocationReason
    }
    
    trait Tag extends js.Object {
      /**
        * Key (name) of the tag.
        */
      var Key: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TagKey
      /**
        * Value of the tag.
        */
      var Value: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TagValue] = js.undefined
    }
    
    trait TagCertificateAuthorityRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * List of tags to be associated with the CA.
        */
      var Tags: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TagList
    }
    
    trait UntagCertificateAuthorityRequest extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * List of tags to be removed from the CA.
        */
      var Tags: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TagList
    }
    
    trait UpdateCertificateAuthorityRequest extends js.Object {
      /**
        * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
        */
      var CertificateAuthorityArn: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Arn
      /**
        * Revocation information for your private CA.
        */
      var RevocationConfiguration: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.RevocationConfiguration] = js.undefined
      /**
        * Status of your private CA.
        */
      var Status: js.UndefOr[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthorityStatus] = js.undefined
    }
    
    trait Validity extends js.Object {
      /**
        * Specifies whether the Value parameter represents days, months, or years.
        */
      var Type: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ValidityPeriodType
      /**
        * Time period.
        */
      var Value: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.PositiveLong
    }
    
    trait _AuditReportResponseFormat extends js.Object
    
    trait _AuditReportStatus extends js.Object
    
    trait _CertificateAuthorityStatus extends js.Object
    
    trait _FailureReason extends js.Object
    
    trait _KeyAlgorithm extends js.Object
    
    trait _RevocationReason extends js.Object
    
    trait _SigningAlgorithm extends js.Object
    
    trait _ValidityPeriodType extends js.Object
    
    trait _apiVersion extends js.Object
    
    val TypesNs: this.type = js.native
    type Arn = java.lang.String
    type AuditReportId = java.lang.String
    type AuditReportResponseFormat = _AuditReportResponseFormat | java.lang.String
    type AuditReportStatus = _AuditReportStatus | java.lang.String
    type Boolean = scala.Boolean
    type CertificateAuthorities = js.Array[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CertificateAuthority]
    type CertificateAuthorityStatus = _CertificateAuthorityStatus | java.lang.String
    type CertificateAuthorityType = awsDashSdkLib.awsDashSdkLibStrings.SUBORDINATE | java.lang.String
    type CertificateBody = java.lang.String
    type CertificateBodyBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmpcaMod.Blob | java.lang.String
    type CertificateChain = java.lang.String
    type CertificateChainBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmpcaMod.Blob | java.lang.String
    type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ClientApiVersions
    type CountryCodeString = java.lang.String
    type CsrBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmpcaMod.Blob | java.lang.String
    type CsrBody = java.lang.String
    type DistinguishedNameQualifierString = java.lang.String
    type FailureReason = _FailureReason | java.lang.String
    type IdempotencyToken = java.lang.String
    type Integer1To5000 = scala.Double
    type KeyAlgorithm = _KeyAlgorithm | java.lang.String
    type MaxResults = scala.Double
    type NextToken = java.lang.String
    type PermanentDeletionTimeInDays = scala.Double
    type PositiveLong = scala.Double
    type RevocationReason = _RevocationReason | java.lang.String
    type SigningAlgorithm = _SigningAlgorithm | java.lang.String
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
    type TagList = js.Array[awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.Tag]
    type TagValue = java.lang.String
    type ValidityPeriodType = _ValidityPeriodType | java.lang.String
    type apiVersion = _apiVersion | java.lang.String
  }
  
}


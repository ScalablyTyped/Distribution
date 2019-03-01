package typings
package awsDashSdkLib.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/acm", "ACM")
@js.native
object ACMNs extends js.Object {
  trait AddTagsToCertificateRequest extends js.Object {
    /**
      * String that contains the ARN of the ACM certificate to which the tag is to be applied. This must be of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
      */
    var CertificateArn: Arn
    /**
      * The key-value pair that defines the tag. The tag value is optional.
      */
    var Tags: TagList
  }
  
  trait CertificateDetail extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var CertificateArn: js.UndefOr[Arn] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the certificate. This has the following format:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
      */
    var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
    /**
      * The time at which the certificate was requested. This value exists only when the certificate type is AMAZON_ISSUED. 
      */
    var CreatedAt: js.UndefOr[TStamp] = js.undefined
    /**
      * The fully qualified domain name for the certificate, such as www.example.com or example.com.
      */
    var DomainName: js.UndefOr[DomainNameString] = js.undefined
    /**
      * Contains information about the initial validation of each domain name that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED. 
      */
    var DomainValidationOptions: js.UndefOr[DomainValidationList] = js.undefined
    /**
      * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the certificate public key can be used and consists of a name and an object identifier (OID). 
      */
    var ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageList] = js.undefined
    /**
      * The reason the certificate request failed. This value exists only when the certificate status is FAILED. For more information, see Certificate Request Failed in the AWS Certificate Manager User Guide. 
      */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
      * The date and time at which the certificate was imported. This value exists only when the certificate type is IMPORTED. 
      */
    var ImportedAt: js.UndefOr[TStamp] = js.undefined
    /**
      * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS resources. 
      */
    var InUseBy: js.UndefOr[InUseList] = js.undefined
    /**
      * The time at which the certificate was issued. This value exists only when the certificate type is AMAZON_ISSUED. 
      */
    var IssuedAt: js.UndefOr[TStamp] = js.undefined
    /**
      * The name of the certificate authority that issued and signed the certificate.
      */
    var Issuer: js.UndefOr[String] = js.undefined
    /**
      * The algorithm that was used to generate the public-private key pair.
      */
    var KeyAlgorithm: js.UndefOr[KeyAlgorithm] = js.undefined
    /**
      * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
      */
    var KeyUsages: js.UndefOr[KeyUsageList] = js.undefined
    /**
      * The time after which the certificate is not valid.
      */
    var NotAfter: js.UndefOr[TStamp] = js.undefined
    /**
      * The time before which the certificate is not valid.
      */
    var NotBefore: js.UndefOr[TStamp] = js.undefined
    /**
      * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to certificate that has not been logged by showing an error message. The logs are cryptographically secure. 
      */
    var Options: js.UndefOr[CertificateOptions] = js.undefined
    /**
      * Specifies whether the certificate is eligible for renewal.
      */
    var RenewalEligibility: js.UndefOr[RenewalEligibility] = js.undefined
    /**
      * Contains information about the status of ACM's managed renewal for the certificate. This field exists only when the certificate type is AMAZON_ISSUED.
      */
    var RenewalSummary: js.UndefOr[RenewalSummary] = js.undefined
    /**
      * The reason the certificate was revoked. This value exists only when the certificate status is REVOKED. 
      */
    var RevocationReason: js.UndefOr[RevocationReason] = js.undefined
    /**
      * The time at which the certificate was revoked. This value exists only when the certificate status is REVOKED. 
      */
    var RevokedAt: js.UndefOr[TStamp] = js.undefined
    /**
      * The serial number of the certificate.
      */
    var Serial: js.UndefOr[String] = js.undefined
    /**
      * The algorithm that was used to sign the certificate.
      */
    var SignatureAlgorithm: js.UndefOr[String] = js.undefined
    /**
      * The status of the certificate.
      */
    var Status: js.UndefOr[CertificateStatus] = js.undefined
    /**
      * The name of the entity that is associated with the public key contained in the certificate.
      */
    var Subject: js.UndefOr[String] = js.undefined
    /**
      * One or more domain names (subject alternative names) included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect to the website. 
      */
    var SubjectAlternativeNames: js.UndefOr[DomainList] = js.undefined
    /**
      * The source of the certificate. For certificates provided by ACM, this value is AMAZON_ISSUED. For certificates that you imported with ImportCertificate, this value is IMPORTED. ACM does not provide managed renewal for imported certificates. For more information about the differences between certificates that you import and those that ACM provides, see Importing Certificates in the AWS Certificate Manager User Guide. 
      */
    var Type: js.UndefOr[CertificateType] = js.undefined
  }
  
  trait CertificateOptions extends js.Object {
    /**
      * You can opt out of certificate transparency logging by specifying the DISABLED option. Opt in by specifying ENABLED. 
      */
    var CertificateTransparencyLoggingPreference: js.UndefOr[CertificateTransparencyLoggingPreference] = js.undefined
  }
  
  trait CertificateSummary extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the certificate. This is of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
      */
    var CertificateArn: js.UndefOr[Arn] = js.undefined
    /**
      * Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
      */
    var DomainName: js.UndefOr[DomainNameString] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait DeleteCertificateRequest extends js.Object {
    /**
      * String that contains the ARN of the ACM certificate to be deleted. This must be of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var CertificateArn: Arn
  }
  
  trait DescribeCertificateRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var CertificateArn: Arn
  }
  
  trait DescribeCertificateResponse extends js.Object {
    /**
      * Metadata about an ACM certificate.
      */
    var Certificate: js.UndefOr[CertificateDetail] = js.undefined
  }
  
  trait DomainValidation extends js.Object {
    /**
      * A fully qualified domain name (FQDN) in the certificate. For example, www.example.com or example.com. 
      */
    var DomainName: DomainNameString
    /**
      * Contains the CNAME record that you add to your DNS database for domain validation. For more information, see Use DNS to Validate Domain Ownership.
      */
    var ResourceRecord: js.UndefOr[ResourceRecord] = js.undefined
    /**
      * The domain name that ACM used to send domain validation emails.
      */
    var ValidationDomain: js.UndefOr[DomainNameString] = js.undefined
    /**
      * A list of email addresses that ACM used to send domain validation emails.
      */
    var ValidationEmails: js.UndefOr[ValidationEmailList] = js.undefined
    /**
      * Specifies the domain validation method.
      */
    var ValidationMethod: js.UndefOr[ValidationMethod] = js.undefined
    /**
      * The validation status of the domain name. This can be one of the following values:    PENDING_VALIDATION     SUCCESS    FAILED  
      */
    var ValidationStatus: js.UndefOr[DomainStatus] = js.undefined
  }
  
  trait DomainValidationOption extends js.Object {
    /**
      * A fully qualified domain name (FQDN) in the certificate request.
      */
    var DomainName: DomainNameString
    /**
      * The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the email addresses that you want ACM to use. This must be the same as the DomainName value or a superdomain of the DomainName value. For example, if you request a certificate for testing.example.com, you can specify example.com for this value. In that case, ACM sends domain validation emails to the following five addresses:   admin@example.com   administrator@example.com   hostmaster@example.com   postmaster@example.com   webmaster@example.com  
      */
    var ValidationDomain: DomainNameString
  }
  
  trait ExportCertificateRequest extends js.Object {
    /**
      * An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:  arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012 
      */
    var CertificateArn: Arn
    /**
      * Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private key, you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:   openssl rsa -in encrypted_key.pem -out decrypted_key.pem 
      */
    var Passphrase: PassphraseBlob
  }
  
  trait ExportCertificateResponse extends js.Object {
    /**
      * The base64 PEM-encoded certificate.
      */
    var Certificate: js.UndefOr[CertificateBody] = js.undefined
    /**
      * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
      */
    var CertificateChain: js.UndefOr[CertificateChain] = js.undefined
    /**
      * The PEM-encoded private key associated with the public key in the certificate.
      */
    var PrivateKey: js.UndefOr[PrivateKey] = js.undefined
  }
  
  trait ExtendedKeyUsage extends js.Object {
    /**
      * The name of an Extended Key Usage value.
      */
    var Name: js.UndefOr[ExtendedKeyUsageName] = js.undefined
    /**
      * An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The following OIDs are defined in RFC 3280 and RFC 5280.     1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)     1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)     1.3.6.1.5.5.7.3.3 (CODE_SIGNING)     1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)     1.3.6.1.5.5.7.3.8 (TIME_STAMPING)     1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)     1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)     1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)     1.3.6.1.5.5.7.3.7 (IPSEC_USER)   
      */
    var OID: js.UndefOr[String] = js.undefined
  }
  
  trait Filters extends js.Object {
    /**
      * Specify one or more ExtendedKeyUsage extension values.
      */
    var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList] = js.undefined
    /**
      * Specify one or more algorithms that can be used to generate key pairs.
      */
    var keyTypes: js.UndefOr[KeyAlgorithmList] = js.undefined
    /**
      * Specify one or more KeyUsage extension values.
      */
    var keyUsage: js.UndefOr[KeyUsageFilterList] = js.undefined
  }
  
  trait GetCertificateRequest extends js.Object {
    /**
      * String that contains a certificate ARN in the following format:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var CertificateArn: Arn
  }
  
  trait GetCertificateResponse extends js.Object {
    /**
      * String that contains the ACM certificate represented by the ARN specified at input.
      */
    var Certificate: js.UndefOr[CertificateBody] = js.undefined
    /**
      * The certificate chain that contains the root certificate issued by the certificate authority (CA).
      */
    var CertificateChain: js.UndefOr[CertificateChain] = js.undefined
  }
  
  trait ImportCertificateRequest extends js.Object {
    /**
      * The certificate to import.
      */
    var Certificate: CertificateBodyBlob
    /**
      * The Amazon Resource Name (ARN) of an imported certificate to replace. To import a new certificate, omit this field. 
      */
    var CertificateArn: js.UndefOr[Arn] = js.undefined
    /**
      * The PEM encoded certificate chain.
      */
    var CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined
    /**
      * The private key that matches the public key in the certificate.
      */
    var PrivateKey: PrivateKeyBlob
  }
  
  trait ImportCertificateResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the imported certificate.
      */
    var CertificateArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait KeyUsage extends js.Object {
    /**
      * A string value that contains a Key Usage extension name.
      */
    var Name: js.UndefOr[KeyUsageName] = js.undefined
  }
  
  trait ListCertificatesRequest extends js.Object {
    /**
      * Filter the certificate list by status value.
      */
    var CertificateStatuses: js.UndefOr[CertificateStatuses] = js.undefined
    /**
      * Filter the certificate list. For more information, see the Filters structure.
      */
    var Includes: js.UndefOr[Filters] = js.undefined
    /**
      * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
      */
    var MaxItems: js.UndefOr[MaxItems] = js.undefined
    /**
      * Use this parameter only when paginating results and only in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCertificatesResponse extends js.Object {
    /**
      * A list of ACM certificates.
      */
    var CertificateSummaryList: js.UndefOr[CertificateSummaryList] = js.undefined
    /**
      * When the list is truncated, this value is present and contains the value to use for the NextToken parameter in a subsequent pagination request.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListTagsForCertificateRequest extends js.Object {
    /**
      * String that contains the ARN of the ACM certificate for which you want to list the tags. This must have the following form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
      */
    var CertificateArn: Arn
  }
  
  trait ListTagsForCertificateResponse extends js.Object {
    /**
      * The key-value pairs that define the applied tags.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait RemoveTagsFromCertificateRequest extends js.Object {
    /**
      * String that contains the ARN of the ACM Certificate with one or more tags that you want to remove. This must be of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
      */
    var CertificateArn: Arn
    /**
      * The key-value pair that defines the tag to remove.
      */
    var Tags: TagList
  }
  
  trait RenewalSummary extends js.Object {
    /**
      * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED.
      */
    var DomainValidationOptions: DomainValidationList
    /**
      * The status of ACM's managed renewal of the certificate.
      */
    var RenewalStatus: RenewalStatus
  }
  
  trait RequestCertificateRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will attempt to issue a public certificate. For more information about private CAs, see the AWS Certificate Manager Private Certificate Authority (PCA) user guide. The ARN must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
      */
    var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
    /**
      *  Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.   The first domain name you enter cannot exceed 63 octets, including periods. Each subsequent Subject Alternative Name (SAN), however, can be up to 253 octets in length. 
      */
    var DomainName: DomainNameString
    /**
      * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
      */
    var DomainValidationOptions: js.UndefOr[DomainValidationOptionList] = js.undefined
    /**
      * Customer chosen string that can be used to distinguish between calls to RequestCertificate. Idempotency tokens time out after one hour. Therefore, if you call RequestCertificate multiple times with the same idempotency token within one hour, ACM recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency token for each call, ACM recognizes that you are requesting multiple certificates.
      */
    var IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined
    /**
      * Currently, you can use this parameter to specify whether to add the certificate to a certificate transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a browser. For more information, see Opting Out of Certificate Transparency Logging.
      */
    var Options: js.UndefOr[CertificateOptions] = js.undefined
    /**
      * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example, add the name www.example.net to a certificate for which the DomainName field is www.example.com if users can reach your site by using either name. The maximum number of domain names that you can add to an ACM certificate is 100. However, the initial limit is 10 domain names. If you need more than 10 names, you must request a limit increase. For more information, see Limits.  The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by periods. No label can be longer than 63 octets. Consider the following examples:     (63 octets).(63 octets).(63 octets).(61 octets) is legal because the total length is 253 octets (63+1+63+1+63+1+61) and no label exceeds 63 octets.    (64 octets).(63 octets).(63 octets).(61 octets) is not legal because the total length exceeds 253 octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.    (63 octets).(63 octets).(63 octets).(62 octets) is not legal because the total length of the DNS name (63+1+63+1+63+1+62) exceeds 253 octets.  
      */
    var SubjectAlternativeNames: js.UndefOr[DomainList] = js.undefined
    /**
      * The method you want to use if you are requesting a public certificate to validate that you own or control domain. You can validate with DNS or validate with email. We recommend that you use DNS validation. 
      */
    var ValidationMethod: js.UndefOr[ValidationMethod] = js.undefined
  }
  
  trait RequestCertificateResponse extends js.Object {
    /**
      * String that contains the ARN of the issued certificate. This must be of the form:  arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012 
      */
    var CertificateArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait ResendValidationEmailRequest extends js.Object {
    /**
      * String that contains the ARN of the requested certificate. The certificate ARN is generated and returned by the RequestCertificate action as soon as the request is made. By default, using this parameter causes email to be sent to all top-level domains you specified in the certificate request. The ARN must be of the form:   arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012 
      */
    var CertificateArn: Arn
    /**
      * The fully qualified domain name (FQDN) of the certificate that needs to be validated.
      */
    var Domain: DomainNameString
    /**
      * The base validation domain that will act as the suffix of the email addresses that are used to send the emails. This must be the same as the Domain value or a superdomain of the Domain value. For example, if you requested a certificate for site.subdomain.example.com and specify a ValidationDomain of subdomain.example.com, ACM sends email to the domain registrant, technical contact, and administrative contact in WHOIS and the following five addresses:   admin@subdomain.example.com   administrator@subdomain.example.com   hostmaster@subdomain.example.com   postmaster@subdomain.example.com   webmaster@subdomain.example.com  
      */
    var ValidationDomain: DomainNameString
  }
  
  trait ResourceRecord extends js.Object {
    /**
      * The name of the DNS record to create in your domain. This is supplied by ACM.
      */
    var Name: String
    /**
      * The type of DNS record. Currently this can be CNAME.
      */
    var Type: RecordType
    /**
      * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
      */
    var Value: String
  }
  
  trait Tag extends js.Object {
    /**
      * The key of the tag.
      */
    var Key: TagKey
    /**
      * The value of the tag.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    def addTagsToCertificate(params: AddTagsToCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToCertificate(
      params: AddTagsToCertificateRequest,
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
    def deleteCertificate(params: DeleteCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCertificate(
      params: DeleteCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed metadata about the specified ACM certificate.
      */
    def describeCertificate(): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed metadata about the specified ACM certificate.
      */
    def describeCertificate(params: DescribeCertificateRequest): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCertificate(
      params: DescribeCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Exports a private certificate issued by a private certificate authority (CA) for use anywhere. You can export the certificate, the certificate chain, and the encrypted private key associated with the public key embedded in the certificate. You must store the private key securely. The private key is a 2048 bit RSA key. You must provide a passphrase for the private key when exporting it. You can use the following OpenSSL command to decrypt it later. Provide the passphrase when prompted.   openssl rsa -in encrypted_key.pem -out decrypted_key.pem 
      */
    def exportCertificate(): awsDashSdkLib.libRequestMod.Request[ExportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def exportCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExportCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Exports a private certificate issued by a private certificate authority (CA) for use anywhere. You can export the certificate, the certificate chain, and the encrypted private key associated with the public key embedded in the certificate. You must store the private key securely. The private key is a 2048 bit RSA key. You must provide a passphrase for the private key when exporting it. You can use the following OpenSSL command to decrypt it later. Provide the passphrase when prompted.   openssl rsa -in encrypted_key.pem -out decrypted_key.pem 
      */
    def exportCertificate(params: ExportCertificateRequest): awsDashSdkLib.libRequestMod.Request[ExportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def exportCertificate(
      params: ExportCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExportCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a certificate specified by an ARN and its certificate chain . The chain is an ordered list of certificates that contains the end entity certificate, intermediate certificates of subordinate CAs, and the root certificate in that order. The certificate and certificate chain are base64 encoded. If you want to decode the certificate to see the individual fields, you can use OpenSSL.
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
      * Retrieves a certificate specified by an ARN and its certificate chain . The chain is an ordered list of certificates that contains the end entity certificate, intermediate certificates of subordinate CAs, and the root certificate in that order. The certificate and certificate chain are base64 encoded. If you want to decode the certificate to see the individual fields, you can use OpenSSL.
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
      * Imports a certificate into AWS Certificate Manager (ACM) to use with services that are integrated with ACM. Note that integrated services allow only certificate types and keys they support to be associated with their resources. Further, their support differs depending on whether the certificate is imported into IAM or into ACM. For more information, see the documentation for each service. For more information about importing certificates into ACM, see Importing Certificates in the AWS Certificate Manager User Guide.   ACM does not provide managed renewal for certificates that you import.  Note the following guidelines when importing third party certificates:   You must enter the private key that matches the certificate you are importing.   The private key must be unencrypted. You cannot import a private key that is protected by a password or a passphrase.   If the certificate you are importing is not self-signed, you must enter its certificate chain.   If a certificate chain is included, the issuer must be the subject of one of the certificates in the chain.   The certificate, private key, and certificate chain must be PEM-encoded.   The current time must be between the Not Before and Not After certificate fields.   The Issuer field must not be empty.   The OCSP authority URL, if present, must not exceed 1000 characters.   To import a new certificate, omit the CertificateArn argument. Include this argument only when you want to replace a previously imported certificate.   When you import a certificate by using the CLI, you must specify the certificate, the certificate chain, and the private key by their file names preceded by file://. For example, you can specify a certificate saved in the C:\temp folder as file://C:\temp\certificate_to_import.pem. If you are making an HTTP or HTTPS Query request, include these arguments as BLOBs.    When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the private key files in the manner required by the programming language you're using.    This operation returns the Amazon Resource Name (ARN) of the imported certificate.
      */
    def importCertificate(): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Imports a certificate into AWS Certificate Manager (ACM) to use with services that are integrated with ACM. Note that integrated services allow only certificate types and keys they support to be associated with their resources. Further, their support differs depending on whether the certificate is imported into IAM or into ACM. For more information, see the documentation for each service. For more information about importing certificates into ACM, see Importing Certificates in the AWS Certificate Manager User Guide.   ACM does not provide managed renewal for certificates that you import.  Note the following guidelines when importing third party certificates:   You must enter the private key that matches the certificate you are importing.   The private key must be unencrypted. You cannot import a private key that is protected by a password or a passphrase.   If the certificate you are importing is not self-signed, you must enter its certificate chain.   If a certificate chain is included, the issuer must be the subject of one of the certificates in the chain.   The certificate, private key, and certificate chain must be PEM-encoded.   The current time must be between the Not Before and Not After certificate fields.   The Issuer field must not be empty.   The OCSP authority URL, if present, must not exceed 1000 characters.   To import a new certificate, omit the CertificateArn argument. Include this argument only when you want to replace a previously imported certificate.   When you import a certificate by using the CLI, you must specify the certificate, the certificate chain, and the private key by their file names preceded by file://. For example, you can specify a certificate saved in the C:\temp folder as file://C:\temp\certificate_to_import.pem. If you are making an HTTP or HTTPS Query request, include these arguments as BLOBs.    When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the private key files in the manner required by the programming language you're using.    This operation returns the Amazon Resource Name (ARN) of the imported certificate.
      */
    def importCertificate(params: ImportCertificateRequest): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importCertificate(
      params: ImportCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a specific status be listed. You can also filter by specific attributes of the certificate. 
      */
    def listCertificates(): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a specific status be listed. You can also filter by specific attributes of the certificate. 
      */
    def listCertificates(params: ListCertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCertificates(
      params: ListCertificatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to specify the certificate. To add a tag to an ACM certificate, use the AddTagsToCertificate action. To delete a tag, use the RemoveTagsFromCertificate action. 
      */
    def listTagsForCertificate(): awsDashSdkLib.libRequestMod.Request[ListTagsForCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to specify the certificate. To add a tag to an ACM certificate, use the AddTagsToCertificate action. To delete a tag, use the RemoveTagsFromCertificate action. 
      */
    def listTagsForCertificate(params: ListTagsForCertificateRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForCertificate(
      params: ListTagsForCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def removeTagsFromCertificate(params: RemoveTagsFromCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromCertificate(
      params: RemoveTagsFromCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests an ACM certificate for use with other AWS services. To request an ACM certificate, you must specify a fully qualified domain name (FQDN) in the DomainName parameter. You can also specify additional FQDNs in the SubjectAlternativeNames parameter.  If you are requesting a private certificate, domain validation is not required. If you are requesting a public certificate, each domain name that you specify must be validated to verify that you own or control the domain. You can use DNS validation or email validation. We recommend that you use DNS validation. ACM issues public certificates after receiving approval from the domain owner. 
      */
    def requestCertificate(): awsDashSdkLib.libRequestMod.Request[RequestCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def requestCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RequestCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RequestCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests an ACM certificate for use with other AWS services. To request an ACM certificate, you must specify a fully qualified domain name (FQDN) in the DomainName parameter. You can also specify additional FQDNs in the SubjectAlternativeNames parameter.  If you are requesting a private certificate, domain validation is not required. If you are requesting a public certificate, each domain name that you specify must be validated to verify that you own or control the domain. You can use DNS validation or email validation. We recommend that you use DNS validation. ACM issues public certificates after receiving approval from the domain owner. 
      */
    def requestCertificate(params: RequestCertificateRequest): awsDashSdkLib.libRequestMod.Request[RequestCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def requestCertificate(
      params: RequestCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RequestCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RequestCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def resendValidationEmail(params: ResendValidationEmailRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resendValidationEmail(
      params: ResendValidationEmailRequest,
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
    def updateCertificateOptions(params: UpdateCertificateOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCertificateOptions(
      params: UpdateCertificateOptionsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the certificateValidated state by periodically calling the underlying ACM.describeCertificateoperation every 60 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_certificateValidated(state: awsDashSdkLib.awsDashSdkLibStrings.certificateValidated): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_certificateValidated(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateValidated,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the certificateValidated state by periodically calling the underlying ACM.describeCertificateoperation every 60 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_certificateValidated(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateValidated,
      params: DescribeCertificateRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_certificateValidated(
      state: awsDashSdkLib.awsDashSdkLibStrings.certificateValidated,
      params: DescribeCertificateRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateCertificateOptionsRequest extends js.Object {
    /**
      * ARN of the requested certificate to update. This must be of the form:  arn:aws:acm:us-east-1:account:certificate/12345678-1234-1234-1234-123456789012  
      */
    var CertificateArn: Arn
    /**
      * Use to update the options for your certificate. Currently, you can specify whether to add your certificate to a transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a browser. 
      */
    var Options: CertificateOptions
  }
  
  trait _CertificateStatus extends js.Object
  
  trait _CertificateTransparencyLoggingPreference extends js.Object
  
  trait _CertificateType extends js.Object
  
  trait _DomainStatus extends js.Object
  
  trait _ExtendedKeyUsageName extends js.Object
  
  trait _FailureReason extends js.Object
  
  trait _KeyAlgorithm extends js.Object
  
  trait _KeyUsageName extends js.Object
  
  trait _RenewalEligibility extends js.Object
  
  trait _RenewalStatus extends js.Object
  
  trait _RevocationReason extends js.Object
  
  trait _ValidationMethod extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmMod.Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmMod.Blob | java.lang.String
  type CertificateStatus = _CertificateStatus | java.lang.String
  type CertificateStatuses = js.Array[CertificateStatus]
  type CertificateSummaryList = js.Array[CertificateSummary]
  type CertificateTransparencyLoggingPreference = _CertificateTransparencyLoggingPreference | java.lang.String
  type CertificateType = _CertificateType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DomainList = js.Array[DomainNameString]
  type DomainNameString = java.lang.String
  type DomainStatus = _DomainStatus | java.lang.String
  type DomainValidationList = js.Array[DomainValidation]
  type DomainValidationOptionList = js.Array[DomainValidationOption]
  type ExtendedKeyUsageFilterList = js.Array[ExtendedKeyUsageName]
  type ExtendedKeyUsageList = js.Array[ExtendedKeyUsage]
  type ExtendedKeyUsageName = _ExtendedKeyUsageName | java.lang.String
  type FailureReason = _FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type InUseList = js.Array[String]
  type KeyAlgorithm = _KeyAlgorithm | java.lang.String
  type KeyAlgorithmList = js.Array[KeyAlgorithm]
  type KeyUsageFilterList = js.Array[KeyUsageName]
  type KeyUsageList = js.Array[KeyUsage]
  type KeyUsageName = _KeyUsageName | java.lang.String
  type MaxItems = scala.Double
  type NextToken = java.lang.String
  type PassphraseBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmMod.Blob | java.lang.String
  type PrivateKey = java.lang.String
  type PrivateKeyBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAcmMod.Blob | java.lang.String
  type RecordType = awsDashSdkLib.awsDashSdkLibStrings.CNAME | java.lang.String
  type RenewalEligibility = _RenewalEligibility | java.lang.String
  type RenewalStatus = _RenewalStatus | java.lang.String
  type RevocationReason = _RevocationReason | java.lang.String
  type String = java.lang.String
  type TStamp = stdLib.Date
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type ValidationEmailList = js.Array[String]
  type ValidationMethod = _ValidationMethod | java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}


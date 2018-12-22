package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ACMPCA
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ACMPCA: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ClientConfiguration = js.native
  /**
     * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this operation returns the Amazon Resource Name (ARN) of the CA.
     */
  def createCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this operation returns the Amazon Resource Name (ARN) of the CA.
     */
  def createCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this operation returns the Amazon Resource Name (ARN) of the CA.
     */
  def createCertificateAuthority(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this operation returns the Amazon Resource Name (ARN) of the CA.
     */
  def createCertificateAuthority(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an audit report that lists every time that the your CA private key is used. The report is saved in the Amazon S3 bucket that you specify on input. The IssueCertificate and RevokeCertificate operations use the private key. You can generate a new report every 30 minutes.
     */
  def createCertificateAuthorityAuditReport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an audit report that lists every time that the your CA private key is used. The report is saved in the Amazon S3 bucket that you specify on input. The IssueCertificate and RevokeCertificate operations use the private key. You can generate a new report every 30 minutes.
     */
  def createCertificateAuthorityAuditReport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityAuditReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an audit report that lists every time that the your CA private key is used. The report is saved in the Amazon S3 bucket that you specify on input. The IssueCertificate and RevokeCertificate operations use the private key. You can generate a new report every 30 minutes.
     */
  def createCertificateAuthorityAuditReport(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityAuditReportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an audit report that lists every time that the your CA private key is used. The report is saved in the Amazon S3 bucket that you specify on input. The IssueCertificate and RevokeCertificate operations use the private key. You can generate a new report every 30 minutes.
     */
  def createCertificateAuthorityAuditReport(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityAuditReportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityAuditReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.CreateCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a private certificate authority (CA). You must provide the ARN (Amazon Resource Name) of the private CA that you want to delete. You can find the ARN by calling the ListCertificateAuthorities operation. Before you can delete a CA, you must disable it. Call the UpdateCertificateAuthority operation and set the CertificateAuthorityStatus parameter to DISABLED.  Additionally, you can delete a CA if you are waiting for it to be created (the Status field of the CertificateAuthority is CREATING). You can also delete it if the CA has been created but you haven't yet imported the signed certificate (the Status is PENDING_CERTIFICATE) into ACM PCA.  If the CA is in one of the aforementioned states and you call DeleteCertificateAuthority, the CA's status changes to DELETED. However, the CA won't be permentantly deleted until the restoration period has passed. By default, if you do not set the PermanentDeletionTimeInDays parameter, the CA remains restorable for 30 days. You can set the parameter from 7 to 30 days. The DescribeCertificateAuthority operation returns the time remaining in the restoration window of a Private CA in the DELETED state. To restore an eligable CA, call the RestoreCertificateAuthority operation.
     */
  def deleteCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a private certificate authority (CA). You must provide the ARN (Amazon Resource Name) of the private CA that you want to delete. You can find the ARN by calling the ListCertificateAuthorities operation. Before you can delete a CA, you must disable it. Call the UpdateCertificateAuthority operation and set the CertificateAuthorityStatus parameter to DISABLED.  Additionally, you can delete a CA if you are waiting for it to be created (the Status field of the CertificateAuthority is CREATING). You can also delete it if the CA has been created but you haven't yet imported the signed certificate (the Status is PENDING_CERTIFICATE) into ACM PCA.  If the CA is in one of the aforementioned states and you call DeleteCertificateAuthority, the CA's status changes to DELETED. However, the CA won't be permentantly deleted until the restoration period has passed. By default, if you do not set the PermanentDeletionTimeInDays parameter, the CA remains restorable for 30 days. You can set the parameter from 7 to 30 days. The DescribeCertificateAuthority operation returns the time remaining in the restoration window of a Private CA in the DELETED state. To restore an eligable CA, call the RestoreCertificateAuthority operation.
     */
  def deleteCertificateAuthority(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a private certificate authority (CA). You must provide the ARN (Amazon Resource Name) of the private CA that you want to delete. You can find the ARN by calling the ListCertificateAuthorities operation. Before you can delete a CA, you must disable it. Call the UpdateCertificateAuthority operation and set the CertificateAuthorityStatus parameter to DISABLED.  Additionally, you can delete a CA if you are waiting for it to be created (the Status field of the CertificateAuthority is CREATING). You can also delete it if the CA has been created but you haven't yet imported the signed certificate (the Status is PENDING_CERTIFICATE) into ACM PCA.  If the CA is in one of the aforementioned states and you call DeleteCertificateAuthority, the CA's status changes to DELETED. However, the CA won't be permentantly deleted until the restoration period has passed. By default, if you do not set the PermanentDeletionTimeInDays parameter, the CA remains restorable for 30 days. You can set the parameter from 7 to 30 days. The DescribeCertificateAuthority operation returns the time remaining in the restoration window of a Private CA in the DELETED state. To restore an eligable CA, call the RestoreCertificateAuthority operation.
     */
  def deleteCertificateAuthority(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DeleteCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a private certificate authority (CA). You must provide the ARN (Amazon Resource Name) of the private CA that you want to delete. You can find the ARN by calling the ListCertificateAuthorities operation. Before you can delete a CA, you must disable it. Call the UpdateCertificateAuthority operation and set the CertificateAuthorityStatus parameter to DISABLED.  Additionally, you can delete a CA if you are waiting for it to be created (the Status field of the CertificateAuthority is CREATING). You can also delete it if the CA has been created but you haven't yet imported the signed certificate (the Status is PENDING_CERTIFICATE) into ACM PCA.  If the CA is in one of the aforementioned states and you call DeleteCertificateAuthority, the CA's status changes to DELETED. However, the CA won't be permentantly deleted until the restoration period has passed. By default, if you do not set the PermanentDeletionTimeInDays parameter, the CA remains restorable for 30 days. You can set the parameter from 7 to 30 days. The DescribeCertificateAuthority operation returns the time remaining in the restoration window of a Private CA in the DELETED state. To restore an eligable CA, call the RestoreCertificateAuthority operation.
     */
  def deleteCertificateAuthority(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DeleteCertificateAuthorityRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:     CREATING - ACM PCA is creating your private certificate authority.    PENDING_CERTIFICATE - The certificate is pending. You must use your on-premises root or subordinate CA to sign your private CA CSR and then import it into PCA.     ACTIVE - Your private CA is active.    DISABLED - Your private CA has been disabled.    EXPIRED - Your private CA certificate has expired.    FAILED - Your private CA has failed. Your CA can fail because of problems such a network outage or backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.     DELETED - Your private CA is within the restoration period, after which it is permanently deleted. The length of time remaining in the CA's restoration period is also included in this operation's output.  
     */
  def describeCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:     CREATING - ACM PCA is creating your private certificate authority.    PENDING_CERTIFICATE - The certificate is pending. You must use your on-premises root or subordinate CA to sign your private CA CSR and then import it into PCA.     ACTIVE - Your private CA is active.    DISABLED - Your private CA has been disabled.    EXPIRED - Your private CA certificate has expired.    FAILED - Your private CA has failed. Your CA can fail because of problems such a network outage or backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.     DELETED - Your private CA is within the restoration period, after which it is permanently deleted. The length of time remaining in the CA's restoration period is also included in this operation's output.  
     */
  def describeCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:     CREATING - ACM PCA is creating your private certificate authority.    PENDING_CERTIFICATE - The certificate is pending. You must use your on-premises root or subordinate CA to sign your private CA CSR and then import it into PCA.     ACTIVE - Your private CA is active.    DISABLED - Your private CA has been disabled.    EXPIRED - Your private CA certificate has expired.    FAILED - Your private CA has failed. Your CA can fail because of problems such a network outage or backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.     DELETED - Your private CA is within the restoration period, after which it is permanently deleted. The length of time remaining in the CA's restoration period is also included in this operation's output.  
     */
  def describeCertificateAuthority(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:     CREATING - ACM PCA is creating your private certificate authority.    PENDING_CERTIFICATE - The certificate is pending. You must use your on-premises root or subordinate CA to sign your private CA CSR and then import it into PCA.     ACTIVE - Your private CA is active.    DISABLED - Your private CA has been disabled.    EXPIRED - Your private CA certificate has expired.    FAILED - Your private CA has failed. Your CA can fail because of problems such a network outage or backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.     DELETED - Your private CA is within the restoration period, after which it is permanently deleted. The length of time remaining in the CA's restoration period is also included in this operation's output.  
     */
  def describeCertificateAuthority(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about a specific audit report created by calling the CreateCertificateAuthorityAuditReport operation. Audit information is created every time the certificate authority (CA) private key is used. The private key is used when you call the IssueCertificate operation or the RevokeCertificate operation. 
     */
  def describeCertificateAuthorityAuditReport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about a specific audit report created by calling the CreateCertificateAuthorityAuditReport operation. Audit information is created every time the certificate authority (CA) private key is used. The private key is used when you call the IssueCertificate operation or the RevokeCertificate operation. 
     */
  def describeCertificateAuthorityAuditReport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about a specific audit report created by calling the CreateCertificateAuthorityAuditReport operation. Audit information is created every time the certificate authority (CA) private key is used. The private key is used when you call the IssueCertificate operation or the RevokeCertificate operation. 
     */
  def describeCertificateAuthorityAuditReport(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about a specific audit report created by calling the CreateCertificateAuthorityAuditReport operation. Audit information is created every time the certificate authority (CA) private key is used. The private key is used when you call the IssueCertificate operation or the RevokeCertificate operation. 
     */
  def describeCertificateAuthorityAuditReport(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the IssueCertificate operation. You must specify both the ARN of your private CA and the ARN of the issued certificate when calling the GetCertificate operation. You can retrieve the certificate if it is in the ISSUED state. You can call the CreateCertificateAuthorityAuditReport operation to create a report that contains information about all of the certificates issued and revoked by your private CA. 
     */
  def getCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the IssueCertificate operation. You must specify both the ARN of your private CA and the ARN of the issued certificate when calling the GetCertificate operation. You can retrieve the certificate if it is in the ISSUED state. You can call the CreateCertificateAuthorityAuditReport operation to create a report that contains information about all of the certificates issued and revoked by your private CA. 
     */
  def getCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the IssueCertificate operation. You must specify both the ARN of your private CA and the ARN of the issued certificate when calling the GetCertificate operation. You can retrieve the certificate if it is in the ISSUED state. You can call the CreateCertificateAuthorityAuditReport operation to create a report that contains information about all of the certificates issued and revoked by your private CA. 
     */
  def getCertificate(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the IssueCertificate operation. You must specify both the ARN of your private CA and the ARN of the issued certificate when calling the GetCertificate operation. You can retrieve the certificate if it is in the ISSUED state. You can call the CreateCertificateAuthorityAuditReport operation to create a report that contains information about all of the certificates issued and revoked by your private CA. 
     */
  def getCertificate(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the chain signs the one before it. 
     */
  def getCertificateAuthorityCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the chain signs the one before it. 
     */
  def getCertificateAuthorityCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the chain signs the one before it. 
     */
  def getCertificateAuthorityCertificate(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the chain signs the one before it. 
     */
  def getCertificateAuthorityCertificate(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created when you call the CreateCertificateAuthority operation. Take the CSR to your on-premises X.509 infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into ACM PCA by calling the ImportCertificateAuthorityCertificate operation. The CSR is returned as a base64 PEM-encoded string. 
     */
  def getCertificateAuthorityCsr(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created when you call the CreateCertificateAuthority operation. Take the CSR to your on-premises X.509 infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into ACM PCA by calling the ImportCertificateAuthorityCertificate operation. The CSR is returned as a base64 PEM-encoded string. 
     */
  def getCertificateAuthorityCsr(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created when you call the CreateCertificateAuthority operation. Take the CSR to your on-premises X.509 infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into ACM PCA by calling the ImportCertificateAuthorityCertificate operation. The CSR is returned as a base64 PEM-encoded string. 
     */
  def getCertificateAuthorityCsr(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created when you call the CreateCertificateAuthority operation. Take the CSR to your on-premises X.509 infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into ACM PCA by calling the ImportCertificateAuthorityCertificate operation. The CSR is returned as a base64 PEM-encoded string. 
     */
  def getCertificateAuthorityCsr(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Imports your signed private CA certificate into ACM PCA. Before you can call this operation, you must create the private certificate authority by calling the CreateCertificateAuthority operation. You must then generate a certificate signing request (CSR) by calling the GetCertificateAuthorityCsr operation. Take the CSR to your on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate chain and copy the signed certificate and the certificate chain to your working directory.   Your certificate chain must not include the private CA certificate that you are importing.   Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any, that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA must come next, and so on until your chain is built.    The chain must be PEM-encoded. 
     */
  def importCertificateAuthorityCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Imports your signed private CA certificate into ACM PCA. Before you can call this operation, you must create the private certificate authority by calling the CreateCertificateAuthority operation. You must then generate a certificate signing request (CSR) by calling the GetCertificateAuthorityCsr operation. Take the CSR to your on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate chain and copy the signed certificate and the certificate chain to your working directory.   Your certificate chain must not include the private CA certificate that you are importing.   Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any, that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA must come next, and so on until your chain is built.    The chain must be PEM-encoded. 
     */
  def importCertificateAuthorityCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Imports your signed private CA certificate into ACM PCA. Before you can call this operation, you must create the private certificate authority by calling the CreateCertificateAuthority operation. You must then generate a certificate signing request (CSR) by calling the GetCertificateAuthorityCsr operation. Take the CSR to your on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate chain and copy the signed certificate and the certificate chain to your working directory.   Your certificate chain must not include the private CA certificate that you are importing.   Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any, that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA must come next, and so on until your chain is built.    The chain must be PEM-encoded. 
     */
  def importCertificateAuthorityCertificate(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ImportCertificateAuthorityCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Imports your signed private CA certificate into ACM PCA. Before you can call this operation, you must create the private certificate authority by calling the CreateCertificateAuthority operation. You must then generate a certificate signing request (CSR) by calling the GetCertificateAuthorityCsr operation. Take the CSR to your on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate chain and copy the signed certificate and the certificate chain to your working directory.   Your certificate chain must not include the private CA certificate that you are importing.   Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any, that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA must come next, and so on until your chain is built.    The chain must be PEM-encoded. 
     */
  def importCertificateAuthorityCertificate(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ImportCertificateAuthorityCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Uses your private certificate authority (CA) to issue a client certificate. This operation returns the Amazon Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the GetCertificate operation and specifying the ARN.   You cannot use the ACM ListCertificateAuthorities operation to retrieve the ARNs of the certificates that you issue by using ACM PCA. 
     */
  def issueCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IssueCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uses your private certificate authority (CA) to issue a client certificate. This operation returns the Amazon Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the GetCertificate operation and specifying the ARN.   You cannot use the ACM ListCertificateAuthorities operation to retrieve the ARNs of the certificates that you issue by using ACM PCA. 
     */
  def issueCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IssueCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IssueCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uses your private certificate authority (CA) to issue a client certificate. This operation returns the Amazon Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the GetCertificate operation and specifying the ARN.   You cannot use the ACM ListCertificateAuthorities operation to retrieve the ARNs of the certificates that you issue by using ACM PCA. 
     */
  def issueCertificate(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IssueCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IssueCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uses your private certificate authority (CA) to issue a client certificate. This operation returns the Amazon Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the GetCertificate operation and specifying the ARN.   You cannot use the ACM ListCertificateAuthorities operation to retrieve the ARNs of the certificates that you issue by using ACM PCA. 
     */
  def issueCertificate(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IssueCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IssueCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.IssueCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the private certificate authorities that you created by using the CreateCertificateAuthority operation.
     */
  def listCertificateAuthorities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the private certificate authorities that you created by using the CreateCertificateAuthority operation.
     */
  def listCertificateAuthorities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the private certificate authorities that you created by using the CreateCertificateAuthority operation.
     */
  def listCertificateAuthorities(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListCertificateAuthoritiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the private certificate authorities that you created by using the CreateCertificateAuthority operation.
     */
  def listCertificateAuthorities(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListCertificateAuthoritiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify and organize your CAs. Each tag consists of a key and an optional value. Call the TagCertificateAuthority operation to add one or more tags to your CA. Call the UntagCertificateAuthority operation to remove tags. 
     */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify and organize your CAs. Each tag consists of a key and an optional value. Call the TagCertificateAuthority operation to add one or more tags to your CA. Call the UntagCertificateAuthority operation to remove tags. 
     */
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify and organize your CAs. Each tag consists of a key and an optional value. Call the TagCertificateAuthority operation to add one or more tags to your CA. Call the UntagCertificateAuthority operation to remove tags. 
     */
  def listTags(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify and organize your CAs. Each tag consists of a key and an optional value. Call the TagCertificateAuthority operation to add one or more tags to your CA. Call the UntagCertificateAuthority operation to remove tags. 
     */
  def listTags(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores a certificate authority (CA) that is in the DELETED state. You can restore a CA during the period that you defined in the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthority operation. Currently, you can specify 7 to 30 days. If you did not specify a PermanentDeletionTimeInDays value, by default you can restore the CA at any time in a 30 day period. You can check the time remaining in the restoration period of a private CA in the DELETED state by calling the DescribeCertificateAuthority or ListCertificateAuthorities operations. The status of a restored CA is set to its pre-deletion status when the RestoreCertificateAuthority operation returns. To change its status to ACTIVE, call the UpdateCertificateAuthority operation. If the private CA was in the PENDING_CERTIFICATE state at deletion, you must use the ImportCertificateAuthorityCertificate operation to import a certificate authority into the private CA before it can be activated. You cannot restore a CA after the restoration period has ended.
     */
  def restoreCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Restores a certificate authority (CA) that is in the DELETED state. You can restore a CA during the period that you defined in the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthority operation. Currently, you can specify 7 to 30 days. If you did not specify a PermanentDeletionTimeInDays value, by default you can restore the CA at any time in a 30 day period. You can check the time remaining in the restoration period of a private CA in the DELETED state by calling the DescribeCertificateAuthority or ListCertificateAuthorities operations. The status of a restored CA is set to its pre-deletion status when the RestoreCertificateAuthority operation returns. To change its status to ACTIVE, call the UpdateCertificateAuthority operation. If the private CA was in the PENDING_CERTIFICATE state at deletion, you must use the ImportCertificateAuthorityCertificate operation to import a certificate authority into the private CA before it can be activated. You cannot restore a CA after the restoration period has ended.
     */
  def restoreCertificateAuthority(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Restores a certificate authority (CA) that is in the DELETED state. You can restore a CA during the period that you defined in the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthority operation. Currently, you can specify 7 to 30 days. If you did not specify a PermanentDeletionTimeInDays value, by default you can restore the CA at any time in a 30 day period. You can check the time remaining in the restoration period of a private CA in the DELETED state by calling the DescribeCertificateAuthority or ListCertificateAuthorities operations. The status of a restored CA is set to its pre-deletion status when the RestoreCertificateAuthority operation returns. To change its status to ACTIVE, call the UpdateCertificateAuthority operation. If the private CA was in the PENDING_CERTIFICATE state at deletion, you must use the ImportCertificateAuthorityCertificate operation to import a certificate authority into the private CA before it can be activated. You cannot restore a CA after the restoration period has ended.
     */
  def restoreCertificateAuthority(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.RestoreCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Restores a certificate authority (CA) that is in the DELETED state. You can restore a CA during the period that you defined in the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthority operation. Currently, you can specify 7 to 30 days. If you did not specify a PermanentDeletionTimeInDays value, by default you can restore the CA at any time in a 30 day period. You can check the time remaining in the restoration period of a private CA in the DELETED state by calling the DescribeCertificateAuthority or ListCertificateAuthorities operations. The status of a restored CA is set to its pre-deletion status when the RestoreCertificateAuthority operation returns. To change its status to ACTIVE, call the UpdateCertificateAuthority operation. If the private CA was in the PENDING_CERTIFICATE state at deletion, you must use the ImportCertificateAuthorityCertificate operation to import a certificate authority into the private CA before it can be activated. You cannot restore a CA after the restoration period has ended.
     */
  def restoreCertificateAuthority(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.RestoreCertificateAuthorityRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes a certificate that you issued by calling the IssueCertificate operation. If you enable a certificate revocation list (CRL) when you create or update your private CA, information about the revoked certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more information about revocation, see the CrlConfiguration structure. ACM PCA also writes revocation information to the audit report. For more information, see CreateCertificateAuthorityAuditReport. 
     */
  def revokeCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes a certificate that you issued by calling the IssueCertificate operation. If you enable a certificate revocation list (CRL) when you create or update your private CA, information about the revoked certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more information about revocation, see the CrlConfiguration structure. ACM PCA also writes revocation information to the audit report. For more information, see CreateCertificateAuthorityAuditReport. 
     */
  def revokeCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes a certificate that you issued by calling the IssueCertificate operation. If you enable a certificate revocation list (CRL) when you create or update your private CA, information about the revoked certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more information about revocation, see the CrlConfiguration structure. ACM PCA also writes revocation information to the audit report. For more information, see CreateCertificateAuthorityAuditReport. 
     */
  def revokeCertificate(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.RevokeCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes a certificate that you issued by calling the IssueCertificate operation. If you enable a certificate revocation list (CRL) when you create or update your private CA, information about the revoked certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more information about revocation, see the CrlConfiguration structure. ACM PCA also writes revocation information to the audit report. For more information, see CreateCertificateAuthorityAuditReport. 
     */
  def revokeCertificate(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.RevokeCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs if you want to filter for a common relationship among those CAs. To remove one or more tags, use the UntagCertificateAuthority operation. Call the ListTags operation to see what tags are associated with your CA. 
     */
  def tagCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs if you want to filter for a common relationship among those CAs. To remove one or more tags, use the UntagCertificateAuthority operation. Call the ListTags operation to see what tags are associated with your CA. 
     */
  def tagCertificateAuthority(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs if you want to filter for a common relationship among those CAs. To remove one or more tags, use the UntagCertificateAuthority operation. Call the ListTags operation to see what tags are associated with your CA. 
     */
  def tagCertificateAuthority(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TagCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs if you want to filter for a common relationship among those CAs. To remove one or more tags, use the UntagCertificateAuthority operation. Call the ListTags operation to see what tags are associated with your CA. 
     */
  def tagCertificateAuthority(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.TagCertificateAuthorityRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value portion of the tag when calling this operation, the tag will be removed regardless of value. If you specify a value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the TagCertificateAuthority. Call the ListTags operation to see what tags are associated with your CA. 
     */
  def untagCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value portion of the tag when calling this operation, the tag will be removed regardless of value. If you specify a value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the TagCertificateAuthority. Call the ListTags operation to see what tags are associated with your CA. 
     */
  def untagCertificateAuthority(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value portion of the tag when calling this operation, the tag will be removed regardless of value. If you specify a value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the TagCertificateAuthority. Call the ListTags operation to see what tags are associated with your CA. 
     */
  def untagCertificateAuthority(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.UntagCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value portion of the tag when calling this operation, the tag will be removed regardless of value. If you specify a value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the TagCertificateAuthority. Call the ListTags operation to see what tags are associated with your CA. 
     */
  def untagCertificateAuthority(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.UntagCertificateAuthorityRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the ACTIVE or DISABLED state before you can update it. You can disable a private CA that is in the ACTIVE state or make a CA that is in the DISABLED state active again.
     */
  def updateCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the ACTIVE or DISABLED state before you can update it. You can disable a private CA that is in the ACTIVE state or make a CA that is in the DISABLED state active again.
     */
  def updateCertificateAuthority(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the ACTIVE or DISABLED state before you can update it. You can disable a private CA that is in the ACTIVE state or make a CA that is in the DISABLED state active again.
     */
  def updateCertificateAuthority(params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.UpdateCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the ACTIVE or DISABLED state before you can update it. You can disable a private CA that is in the ACTIVE state or make a CA that is in the DISABLED state active again.
     */
  def updateCertificateAuthority(
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.UpdateCertificateAuthorityRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Waits for the auditReportCreated state by periodically calling the underlying ACMPCA.describeCertificateAuthorityAuditReportoperation every 3 seconds (at most 60 times). Wait until a Audit Report is created
     */
  @JSName("waitFor")
  def waitFor_auditReportCreated(state: awsDashSdkLib.awsDashSdkLibStrings.auditReportCreated): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the auditReportCreated state by periodically calling the underlying ACMPCA.describeCertificateAuthorityAuditReportoperation every 3 seconds (at most 60 times). Wait until a Audit Report is created
     */
  @JSName("waitFor")
  def waitFor_auditReportCreated(
    state: awsDashSdkLib.awsDashSdkLibStrings.auditReportCreated,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the auditReportCreated state by periodically calling the underlying ACMPCA.describeCertificateAuthorityAuditReportoperation every 3 seconds (at most 60 times). Wait until a Audit Report is created
     */
  @JSName("waitFor")
  def waitFor_auditReportCreated(
    state: awsDashSdkLib.awsDashSdkLibStrings.auditReportCreated,
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the auditReportCreated state by periodically calling the underlying ACMPCA.describeCertificateAuthorityAuditReportoperation every 3 seconds (at most 60 times). Wait until a Audit Report is created
     */
  @JSName("waitFor")
  def waitFor_auditReportCreated(
    state: awsDashSdkLib.awsDashSdkLibStrings.auditReportCreated,
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.DescribeCertificateAuthorityAuditReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the certificateAuthorityCSRCreated state by periodically calling the underlying ACMPCA.getCertificateAuthorityCsroperation every 3 seconds (at most 60 times). Wait until a Certificate Authority CSR is created
     */
  @JSName("waitFor")
  def waitFor_certificateAuthorityCSRCreated(state: awsDashSdkLib.awsDashSdkLibStrings.certificateAuthorityCSRCreated): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the certificateAuthorityCSRCreated state by periodically calling the underlying ACMPCA.getCertificateAuthorityCsroperation every 3 seconds (at most 60 times). Wait until a Certificate Authority CSR is created
     */
  @JSName("waitFor")
  def waitFor_certificateAuthorityCSRCreated(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateAuthorityCSRCreated,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the certificateAuthorityCSRCreated state by periodically calling the underlying ACMPCA.getCertificateAuthorityCsroperation every 3 seconds (at most 60 times). Wait until a Certificate Authority CSR is created
     */
  @JSName("waitFor")
  def waitFor_certificateAuthorityCSRCreated(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateAuthorityCSRCreated,
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the certificateAuthorityCSRCreated state by periodically calling the underlying ACMPCA.getCertificateAuthorityCsroperation every 3 seconds (at most 60 times). Wait until a Certificate Authority CSR is created
     */
  @JSName("waitFor")
  def waitFor_certificateAuthorityCSRCreated(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateAuthorityCSRCreated,
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateAuthorityCsrResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the certificateIssued state by periodically calling the underlying ACMPCA.getCertificateoperation every 3 seconds (at most 60 times). Wait until a certificate is issued
     */
  @JSName("waitFor")
  def waitFor_certificateIssued(state: awsDashSdkLib.awsDashSdkLibStrings.certificateIssued): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the certificateIssued state by periodically calling the underlying ACMPCA.getCertificateoperation every 3 seconds (at most 60 times). Wait until a certificate is issued
     */
  @JSName("waitFor")
  def waitFor_certificateIssued(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateIssued,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the certificateIssued state by periodically calling the underlying ACMPCA.getCertificateoperation every 3 seconds (at most 60 times). Wait until a certificate is issued
     */
  @JSName("waitFor")
  def waitFor_certificateIssued(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateIssued,
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the certificateIssued state by periodically calling the underlying ACMPCA.getCertificateoperation every 3 seconds (at most 60 times). Wait until a certificate is issued
     */
  @JSName("waitFor")
  def waitFor_certificateIssued(
    state: awsDashSdkLib.awsDashSdkLibStrings.certificateIssued,
    params: awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAcmpcaMod.ACMPCANs.GetCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}


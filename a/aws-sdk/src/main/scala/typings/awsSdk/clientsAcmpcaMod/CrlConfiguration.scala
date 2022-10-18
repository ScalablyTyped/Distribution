package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrlConfiguration extends StObject {
  
  /**
    * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
    */
  var CustomCname: js.UndefOr[String253] = js.undefined
  
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to enable certificate revocation for a new CA when you call the CreateCertificateAuthority action or for an existing CA when you call the UpdateCertificateAuthority action. 
    */
  var Enabled: Boolean
  
  /**
    * Validity period of the CRL in days.
    */
  var ExpirationInDays: js.UndefOr[Integer1To5000] = js.undefined
  
  /**
    * Name of the S3 bucket that contains the CRL. If you do not provide a value for the CustomCname argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You can change the name of your bucket by calling the UpdateCertificateAuthority operation. You must specify a bucket policy that allows ACM Private CA to write the CRL to your bucket.
    */
  var S3BucketName: js.UndefOr[String3To255] = js.undefined
  
  /**
    * Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3 bucket. If you choose PUBLIC_READ, the CRL will be accessible over the public internet. If you choose BUCKET_OWNER_FULL_CONTROL, only the owner of the CRL S3 bucket can access the CRL, and your PKI clients may need an alternative method of access.  If no value is specified, the default is PUBLIC_READ.  Note: This default can cause CA creation to fail in some circumstances. If you have have enabled the Block Public Access (BPA) feature in your S3 account, then you must specify the value of this parameter as BUCKET_OWNER_FULL_CONTROL, and not doing so results in an error. If you have disabled BPA in S3, then you can specify either BUCKET_OWNER_FULL_CONTROL or PUBLIC_READ as the value. For more information, see Blocking public access to the S3 bucket.
    */
  var S3ObjectAcl: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.S3ObjectAcl] = js.undefined
}
object CrlConfiguration {
  
  inline def apply(Enabled: Boolean): CrlConfiguration = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrlConfiguration]
  }
  
  extension [Self <: CrlConfiguration](x: Self) {
    
    inline def setCustomCname(value: String253): Self = StObject.set(x, "CustomCname", value.asInstanceOf[js.Any])
    
    inline def setCustomCnameUndefined: Self = StObject.set(x, "CustomCname", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setExpirationInDays(value: Integer1To5000): Self = StObject.set(x, "ExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setExpirationInDaysUndefined: Self = StObject.set(x, "ExpirationInDays", js.undefined)
    
    inline def setS3BucketName(value: String3To255): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3ObjectAcl(value: S3ObjectAcl): Self = StObject.set(x, "S3ObjectAcl", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectAclUndefined: Self = StObject.set(x, "S3ObjectAcl", js.undefined)
  }
}

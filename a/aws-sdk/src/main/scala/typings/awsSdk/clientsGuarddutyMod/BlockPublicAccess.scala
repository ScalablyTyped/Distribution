package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockPublicAccess extends StObject {
  
  /**
    * Indicates if S3 Block Public Access is set to BlockPublicAcls.
    */
  var BlockPublicAcls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if S3 Block Public Access is set to BlockPublicPolicy.
    */
  var BlockPublicPolicy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if S3 Block Public Access is set to IgnorePublicAcls.
    */
  var IgnorePublicAcls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if S3 Block Public Access is set to RestrictPublicBuckets.
    */
  var RestrictPublicBuckets: js.UndefOr[Boolean] = js.undefined
}
object BlockPublicAccess {
  
  inline def apply(): BlockPublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockPublicAccess]
  }
  
  extension [Self <: BlockPublicAccess](x: Self) {
    
    inline def setBlockPublicAcls(value: Boolean): Self = StObject.set(x, "BlockPublicAcls", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAclsUndefined: Self = StObject.set(x, "BlockPublicAcls", js.undefined)
    
    inline def setBlockPublicPolicy(value: Boolean): Self = StObject.set(x, "BlockPublicPolicy", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicPolicyUndefined: Self = StObject.set(x, "BlockPublicPolicy", js.undefined)
    
    inline def setIgnorePublicAcls(value: Boolean): Self = StObject.set(x, "IgnorePublicAcls", value.asInstanceOf[js.Any])
    
    inline def setIgnorePublicAclsUndefined: Self = StObject.set(x, "IgnorePublicAcls", js.undefined)
    
    inline def setRestrictPublicBuckets(value: Boolean): Self = StObject.set(x, "RestrictPublicBuckets", value.asInstanceOf[js.Any])
    
    inline def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "RestrictPublicBuckets", js.undefined)
  }
}

package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutoMergingPreviewResponse extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The number of match groups in the domain that have been reviewed in this preview dry run.
    */
  var NumberOfMatchesInSample: js.UndefOr[long] = js.undefined
  
  /**
    * The number of profiles found in this preview dry run.
    */
  var NumberOfProfilesInSample: js.UndefOr[long] = js.undefined
  
  /**
    * The number of profiles that would be merged if this wasn't a preview dry run.
    */
  var NumberOfProfilesWillBeMerged: js.UndefOr[long] = js.undefined
}
object GetAutoMergingPreviewResponse {
  
  inline def apply(DomainName: name): GetAutoMergingPreviewResponse = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoMergingPreviewResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAutoMergingPreviewResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMatchesInSample(value: long): Self = StObject.set(x, "NumberOfMatchesInSample", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMatchesInSampleUndefined: Self = StObject.set(x, "NumberOfMatchesInSample", js.undefined)
    
    inline def setNumberOfProfilesInSample(value: long): Self = StObject.set(x, "NumberOfProfilesInSample", value.asInstanceOf[js.Any])
    
    inline def setNumberOfProfilesInSampleUndefined: Self = StObject.set(x, "NumberOfProfilesInSample", js.undefined)
    
    inline def setNumberOfProfilesWillBeMerged(value: long): Self = StObject.set(x, "NumberOfProfilesWillBeMerged", value.asInstanceOf[js.Any])
    
    inline def setNumberOfProfilesWillBeMergedUndefined: Self = StObject.set(x, "NumberOfProfilesWillBeMerged", js.undefined)
  }
}

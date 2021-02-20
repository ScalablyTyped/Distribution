package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFieldProperties extends StObject {
  
  /**
    *  Indicates if the field can be queried. 
    */
  var isQueryable: js.UndefOr[Boolean] = js.native
  
  /**
    *  Indicates whether the field can be returned in a search result. 
    */
  var isRetrievable: js.UndefOr[Boolean] = js.native
}
object SourceFieldProperties {
  
  @scala.inline
  def apply(): SourceFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceFieldProperties]
  }
  
  @scala.inline
  implicit class SourceFieldPropertiesMutableBuilder[Self <: SourceFieldProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsQueryable(value: Boolean): Self = StObject.set(x, "isQueryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsQueryableUndefined: Self = StObject.set(x, "isQueryable", js.undefined)
    
    @scala.inline
    def setIsRetrievable(value: Boolean): Self = StObject.set(x, "isRetrievable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRetrievableUndefined: Self = StObject.set(x, "isRetrievable", js.undefined)
  }
}

package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPublishOptions extends StObject {
  
  var acknowledge: js.UndefOr[Boolean] = js.native
  
  var disclose_me: js.UndefOr[Boolean] = js.native
  
  var eligible: js.UndefOr[js.Array[Double]] = js.native
  
  var eligible_authid: js.UndefOr[js.Array[String]] = js.native
  
  var eligible_authrole: js.UndefOr[js.Array[String]] = js.native
  
  var exclude: js.UndefOr[js.Array[Double]] = js.native
  
  var exclude_authid: js.UndefOr[js.Array[String]] = js.native
  
  var exclude_authrole: js.UndefOr[js.Array[String]] = js.native
  
  var exclude_me: js.UndefOr[Boolean] = js.native
  
  var retain: js.UndefOr[Boolean] = js.native
}
object IPublishOptions {
  
  @scala.inline
  def apply(): IPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPublishOptions]
  }
  
  @scala.inline
  implicit class IPublishOptionsMutableBuilder[Self <: IPublishOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    @scala.inline
    def setDisclose_me(value: Boolean): Self = StObject.set(x, "disclose_me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisclose_meUndefined: Self = StObject.set(x, "disclose_me", js.undefined)
    
    @scala.inline
    def setEligible(value: js.Array[Double]): Self = StObject.set(x, "eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibleUndefined: Self = StObject.set(x, "eligible", js.undefined)
    
    @scala.inline
    def setEligibleVarargs(value: Double*): Self = StObject.set(x, "eligible", js.Array(value :_*))
    
    @scala.inline
    def setEligible_authid(value: js.Array[String]): Self = StObject.set(x, "eligible_authid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligible_authidUndefined: Self = StObject.set(x, "eligible_authid", js.undefined)
    
    @scala.inline
    def setEligible_authidVarargs(value: String*): Self = StObject.set(x, "eligible_authid", js.Array(value :_*))
    
    @scala.inline
    def setEligible_authrole(value: js.Array[String]): Self = StObject.set(x, "eligible_authrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligible_authroleUndefined: Self = StObject.set(x, "eligible_authrole", js.undefined)
    
    @scala.inline
    def setEligible_authroleVarargs(value: String*): Self = StObject.set(x, "eligible_authrole", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[Double]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: Double*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude_authid(value: js.Array[String]): Self = StObject.set(x, "exclude_authid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_authidUndefined: Self = StObject.set(x, "exclude_authid", js.undefined)
    
    @scala.inline
    def setExclude_authidVarargs(value: String*): Self = StObject.set(x, "exclude_authid", js.Array(value :_*))
    
    @scala.inline
    def setExclude_authrole(value: js.Array[String]): Self = StObject.set(x, "exclude_authrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_authroleUndefined: Self = StObject.set(x, "exclude_authrole", js.undefined)
    
    @scala.inline
    def setExclude_authroleVarargs(value: String*): Self = StObject.set(x, "exclude_authrole", js.Array(value :_*))
    
    @scala.inline
    def setExclude_me(value: Boolean): Self = StObject.set(x, "exclude_me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_meUndefined: Self = StObject.set(x, "exclude_me", js.undefined)
    
    @scala.inline
    def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
  }
}

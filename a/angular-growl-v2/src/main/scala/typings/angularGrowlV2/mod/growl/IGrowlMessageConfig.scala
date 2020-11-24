package typings.angularGrowlV2.mod.growl

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom configuration used in single message call.
  */
@js.native
trait IGrowlMessageConfig extends js.Object {
  
  var disableCloseButton: js.UndefOr[Boolean] = js.native
  
  var disableCountDown: js.UndefOr[Boolean] = js.native
  
  var disableIcons: js.UndefOr[Boolean] = js.native
  
  var onclose: js.UndefOr[Function] = js.native
  
  var onopen: js.UndefOr[Function] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var referenceId: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var translateMessage: js.UndefOr[Boolean] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
  
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object IGrowlMessageConfig {
  
  @scala.inline
  def apply(): IGrowlMessageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrowlMessageConfig]
  }
  
  @scala.inline
  implicit class IGrowlMessageConfigOps[Self <: IGrowlMessageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableCloseButton(value: Boolean): Self = this.set("disableCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCloseButton: Self = this.set("disableCloseButton", js.undefined)
    
    @scala.inline
    def setDisableCountDown(value: Boolean): Self = this.set("disableCountDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCountDown: Self = this.set("disableCountDown", js.undefined)
    
    @scala.inline
    def setDisableIcons(value: Boolean): Self = this.set("disableIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableIcons: Self = this.set("disableIcons", js.undefined)
    
    @scala.inline
    def setOnclose(value: Function): Self = this.set("onclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    
    @scala.inline
    def setOnopen(value: Function): Self = this.set("onopen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnopen: Self = this.set("onopen", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReferenceId(value: Double): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceId: Self = this.set("referenceId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTranslateMessage(value: Boolean): Self = this.set("translateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateMessage: Self = this.set("translateMessage", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}

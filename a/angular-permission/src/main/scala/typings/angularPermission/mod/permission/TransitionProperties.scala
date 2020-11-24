package typings.angularPermission.mod.permission

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionProperties extends js.Object {
  
  var fromParams: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
  ] = js.native
  
  var fromState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
  ] = js.native
  
  var options: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
  ] = js.native
  
  var toParams: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
  ] = js.native
  
  var toState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
  ] = js.native
}
object TransitionProperties {
  
  @scala.inline
  def apply(): TransitionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProperties]
  }
  
  @scala.inline
  implicit class TransitionPropertiesOps[Self <: TransitionProperties] (val x: Self) extends AnyVal {
    
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
    def setFromParams(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
    ): Self = this.set("fromParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromParams: Self = this.set("fromParams", js.undefined)
    
    @scala.inline
    def setFromState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
    ): Self = this.set("fromState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromState: Self = this.set("fromState", js.undefined)
    
    @scala.inline
    def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setToParams(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
    ): Self = this.set("toParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToParams: Self = this.set("toParams", js.undefined)
    
    @scala.inline
    def setToState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
    ): Self = this.set("toState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToState: Self = this.set("toState", js.undefined)
  }
}

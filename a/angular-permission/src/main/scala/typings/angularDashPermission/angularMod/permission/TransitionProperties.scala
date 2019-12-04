package typings.angularDashPermission.angularMod.permission

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProperties extends js.Object {
  var fromParams: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
  ] = js.undefined
  var fromState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
  ] = js.undefined
  var options: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
  ] = js.undefined
  var toParams: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
  ] = js.undefined
  var toState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
  ] = js.undefined
}

object TransitionProperties {
  @scala.inline
  def apply(
    fromParams: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any = null,
    fromState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any = null,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any = null,
    toParams: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any = null,
    toState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any = null
  ): TransitionProperties = {
    val __obj = js.Dynamic.literal()
    if (fromParams != null) __obj.updateDynamic("fromParams")(fromParams.asInstanceOf[js.Any])
    if (fromState != null) __obj.updateDynamic("fromState")(fromState.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (toParams != null) __obj.updateDynamic("toParams")(toParams.asInstanceOf[js.Any])
    if (toState != null) __obj.updateDynamic("toState")(toState.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProperties]
  }
}


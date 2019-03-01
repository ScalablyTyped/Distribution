package typings
package angularDashPermissionLib.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProperties extends js.Object {
  var fromParams: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
  ] = js.undefined
  var fromState: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IState */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
  ] = js.undefined
  var options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
  ] = js.undefined
  var toParams: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
  ] = js.undefined
  var toState: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IState */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
  ] = js.undefined
}

object TransitionProperties {
  @scala.inline
  def apply(
    fromParams: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any = null,
    fromState: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any = null,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any = null,
    toParams: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any = null,
    toState: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any = null
  ): TransitionProperties = {
    val __obj = js.Dynamic.literal()
    if (fromParams != null) __obj.updateDynamic("fromParams")(fromParams)
    if (fromState != null) __obj.updateDynamic("fromState")(fromState)
    if (options != null) __obj.updateDynamic("options")(options)
    if (toParams != null) __obj.updateDynamic("toParams")(toParams)
    if (toState != null) __obj.updateDynamic("toState")(toState)
    __obj.asInstanceOf[TransitionProperties]
  }
}


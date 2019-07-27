package typings
package awsDashParamDashStoreLib.awsDashParamDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterQuery extends js.Object {
  def decryption(enabled: scala.Boolean): ParameterQuery = js.native
  def execute(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterList */ _
  ] = js.native
  def executeSync(): /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterList */ js.Any = js.native
  def named(
    nameOrNames: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
  ): ParameterQuery = js.native
  def path(
    path: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
  ): ParameterQuery = js.native
  def recursive(enabled: scala.Boolean): ParameterQuery = js.native
}


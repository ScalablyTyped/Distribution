package typings
package awsDashParamDashStoreLib.awsDashParamDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-param-store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getParameter(
    name: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.Parameter */ _
  ] = js.native
  def getParameter(
    name: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.Parameter */ _
  ] = js.native
  def getParameterSync(
    name: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
  ): js.Any = js.native
  def getParameterSync(
    name: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Any = js.native
  def getParameters(
    names: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.GetParametersResult */ _
  ] = js.native
  def getParameters(
    names: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.GetParametersResult */ _
  ] = js.native
  def getParametersByPath(
    path: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterList */ _
  ] = js.native
  def getParametersByPath(
    path: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterList */ _
  ] = js.native
  def getParametersByPathSync(
    path: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any
  ): js.Any = js.native
  def getParametersByPathSync(
    path: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Any = js.native
  def getParametersSync(
    names: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any
  ): js.Any = js.native
  def getParametersSync(
    names: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Any = js.native
  def parameterQuery(): ParameterQuery = js.native
  def parameterQuery(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): ParameterQuery = js.native
}


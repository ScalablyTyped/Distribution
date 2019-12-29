package typings.awsDashParamDashStore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-param-store", JSImport.Namespace)
@js.native
object awsDashParamDashStoreMod extends js.Object {
  @js.native
  trait ParameterQuery extends js.Object {
    def decryption(enabled: Boolean): ParameterQuery = js.native
    def execute(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ParameterList */ _
      ] = js.native
    def executeSync(): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ParameterList */ js.Any = js.native
    def named(
      nameOrNames: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
    ): ParameterQuery = js.native
    def path(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
    ): ParameterQuery = js.native
    def recursive(enabled: Boolean): ParameterQuery = js.native
  }
  
  def getParameter(
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.Parameter */ _
  ] = js.native
  def getParameter(
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.Parameter */ _
  ] = js.native
  def getParameterSync(
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
  ): js.Any = js.native
  def getParameterSync(
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Any = js.native
  def getParameters(
    names: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.GetParametersResult */ _
  ] = js.native
  def getParameters(
    names: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.GetParametersResult */ _
  ] = js.native
  def getParametersByPath(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ParameterList */ _
  ] = js.native
  def getParametersByPath(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ParameterList */ _
  ] = js.native
  def getParametersByPathSync(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any
  ): js.Any = js.native
  def getParametersByPathSync(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.PSParameterName */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Any = js.native
  def getParametersSync(
    names: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any
  ): js.Any = js.native
  def getParametersSync(
    names: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ParameterNameList */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): js.Any = js.native
  def parameterQuery(): ParameterQuery = js.native
  def parameterQuery(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSM.Types.ClientConfiguration */ js.Any
  ): ParameterQuery = js.native
}


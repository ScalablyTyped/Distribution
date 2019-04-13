package typings
package awsDashParamDashStoreLib.awsDashParamDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-param-store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getParameter(name: awsDashSdkLib.clientsSsmMod.PSParameterName): js.Promise[awsDashSdkLib.clientsSsmMod.Parameter] = js.native
  def getParameter(
    name: awsDashSdkLib.clientsSsmMod.PSParameterName,
    options: awsDashSdkLib.clientsSsmMod.ClientConfiguration
  ): js.Promise[awsDashSdkLib.clientsSsmMod.Parameter] = js.native
  def getParameterSync(name: awsDashSdkLib.clientsSsmMod.PSParameterName): awsDashSdkLib.clientsSsmMod.Parameter = js.native
  def getParameterSync(
    name: awsDashSdkLib.clientsSsmMod.PSParameterName,
    options: awsDashSdkLib.clientsSsmMod.ClientConfiguration
  ): awsDashSdkLib.clientsSsmMod.Parameter = js.native
  def getParameters(names: awsDashSdkLib.clientsSsmMod.ParameterNameList): js.Promise[awsDashSdkLib.clientsSsmMod.GetParametersResult] = js.native
  def getParameters(
    names: awsDashSdkLib.clientsSsmMod.ParameterNameList,
    options: awsDashSdkLib.clientsSsmMod.ClientConfiguration
  ): js.Promise[awsDashSdkLib.clientsSsmMod.GetParametersResult] = js.native
  def getParametersByPath(path: awsDashSdkLib.clientsSsmMod.ParameterNameList): js.Promise[awsDashSdkLib.clientsSsmMod.ParameterList] = js.native
  def getParametersByPath(
    path: awsDashSdkLib.clientsSsmMod.ParameterNameList,
    options: awsDashSdkLib.clientsSsmMod.ClientConfiguration
  ): js.Promise[awsDashSdkLib.clientsSsmMod.ParameterList] = js.native
  def getParametersByPathSync(path: awsDashSdkLib.clientsSsmMod.ParameterNameList): awsDashSdkLib.clientsSsmMod.ParameterList = js.native
  def getParametersByPathSync(
    path: awsDashSdkLib.clientsSsmMod.ParameterNameList,
    options: awsDashSdkLib.clientsSsmMod.ClientConfiguration
  ): awsDashSdkLib.clientsSsmMod.ParameterList = js.native
  def getParametersSync(names: awsDashSdkLib.clientsSsmMod.ParameterNameList): awsDashSdkLib.clientsSsmMod.GetParametersResult = js.native
  def getParametersSync(
    names: awsDashSdkLib.clientsSsmMod.ParameterNameList,
    options: awsDashSdkLib.clientsSsmMod.ClientConfiguration
  ): awsDashSdkLib.clientsSsmMod.GetParametersResult = js.native
  def parameterQuery(): ParameterQuery = js.native
  def parameterQuery(options: awsDashSdkLib.clientsSsmMod.ClientConfiguration): ParameterQuery = js.native
}


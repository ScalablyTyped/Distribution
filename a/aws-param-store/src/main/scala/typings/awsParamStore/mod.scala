package typings.awsParamStore

import typings.awsSdk.ssmMod.ClientConfiguration
import typings.awsSdk.ssmMod.GetParametersResult
import typings.awsSdk.ssmMod.PSParameterName
import typings.awsSdk.ssmMod.Parameter
import typings.awsSdk.ssmMod.ParameterList
import typings.awsSdk.ssmMod.ParameterNameList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-param-store", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getParameter(name: PSParameterName): js.Promise[Parameter] = js.native
  def getParameter(name: PSParameterName, options: ClientConfiguration): js.Promise[Parameter] = js.native
  
  def getParameterSync(name: PSParameterName): Parameter = js.native
  def getParameterSync(name: PSParameterName, options: ClientConfiguration): Parameter = js.native
  
  def getParameters(names: ParameterNameList): js.Promise[GetParametersResult] = js.native
  def getParameters(names: ParameterNameList, options: ClientConfiguration): js.Promise[GetParametersResult] = js.native
  
  def getParametersByPath(path: PSParameterName): js.Promise[ParameterList] = js.native
  def getParametersByPath(path: PSParameterName, options: ClientConfiguration): js.Promise[ParameterList] = js.native
  
  def getParametersByPathSync(path: PSParameterName): ParameterList = js.native
  def getParametersByPathSync(path: PSParameterName, options: ClientConfiguration): ParameterList = js.native
  
  def getParametersSync(names: ParameterNameList): GetParametersResult = js.native
  def getParametersSync(names: ParameterNameList, options: ClientConfiguration): GetParametersResult = js.native
  
  def parameterQuery(): ParameterQuery_ = js.native
  def parameterQuery(options: ClientConfiguration): ParameterQuery_ = js.native
  
  @js.native
  trait ParameterQuery_ extends js.Object {
    
    def decryption(enabled: Boolean): ParameterQuery_ = js.native
    
    def execute(): js.Promise[ParameterList | Parameter | GetParametersResult] = js.native
    
    def executeSync(): ParameterList | Parameter | GetParametersResult = js.native
    
    def named(nameOrNames: PSParameterName): ParameterQuery_ = js.native
    def named(nameOrNames: ParameterNameList): ParameterQuery_ = js.native
    
    def path(path: PSParameterName): ParameterQuery_ = js.native
    
    def recursive(enabled: Boolean): ParameterQuery_ = js.native
  }
}

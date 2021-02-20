package typings.awsParamStore

import typings.awsSdk.ssmMod.ClientConfiguration
import typings.awsSdk.ssmMod.GetParametersResult
import typings.awsSdk.ssmMod.PSParameterName
import typings.awsSdk.ssmMod.Parameter
import typings.awsSdk.ssmMod.ParameterList
import typings.awsSdk.ssmMod.ParameterNameList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-param-store", "getParameter")
  @js.native
  def getParameter(name: PSParameterName): js.Promise[Parameter] = js.native
  @JSImport("aws-param-store", "getParameter")
  @js.native
  def getParameter(name: PSParameterName, options: ClientConfiguration): js.Promise[Parameter] = js.native
  
  @JSImport("aws-param-store", "getParameterSync")
  @js.native
  def getParameterSync(name: PSParameterName): Parameter = js.native
  @JSImport("aws-param-store", "getParameterSync")
  @js.native
  def getParameterSync(name: PSParameterName, options: ClientConfiguration): Parameter = js.native
  
  @JSImport("aws-param-store", "getParameters")
  @js.native
  def getParameters(names: ParameterNameList): js.Promise[GetParametersResult] = js.native
  @JSImport("aws-param-store", "getParameters")
  @js.native
  def getParameters(names: ParameterNameList, options: ClientConfiguration): js.Promise[GetParametersResult] = js.native
  
  @JSImport("aws-param-store", "getParametersByPath")
  @js.native
  def getParametersByPath(path: PSParameterName): js.Promise[ParameterList] = js.native
  @JSImport("aws-param-store", "getParametersByPath")
  @js.native
  def getParametersByPath(path: PSParameterName, options: ClientConfiguration): js.Promise[ParameterList] = js.native
  
  @JSImport("aws-param-store", "getParametersByPathSync")
  @js.native
  def getParametersByPathSync(path: PSParameterName): ParameterList = js.native
  @JSImport("aws-param-store", "getParametersByPathSync")
  @js.native
  def getParametersByPathSync(path: PSParameterName, options: ClientConfiguration): ParameterList = js.native
  
  @JSImport("aws-param-store", "getParametersSync")
  @js.native
  def getParametersSync(names: ParameterNameList): GetParametersResult = js.native
  @JSImport("aws-param-store", "getParametersSync")
  @js.native
  def getParametersSync(names: ParameterNameList, options: ClientConfiguration): GetParametersResult = js.native
  
  @JSImport("aws-param-store", "parameterQuery")
  @js.native
  def parameterQuery(): ParameterQuery_ = js.native
  @JSImport("aws-param-store", "parameterQuery")
  @js.native
  def parameterQuery(options: ClientConfiguration): ParameterQuery_ = js.native
  
  @js.native
  trait ParameterQuery_ extends StObject {
    
    def decryption(enabled: Boolean): ParameterQuery_ = js.native
    
    def execute(): js.Promise[ParameterList | Parameter | GetParametersResult] = js.native
    
    def executeSync(): ParameterList | Parameter | GetParametersResult = js.native
    
    def named(nameOrNames: PSParameterName): ParameterQuery_ = js.native
    def named(nameOrNames: ParameterNameList): ParameterQuery_ = js.native
    
    def path(path: PSParameterName): ParameterQuery_ = js.native
    
    def recursive(enabled: Boolean): ParameterQuery_ = js.native
  }
}

package typings.angularDevkitSchematics

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitCore.mod.BaseException
import typings.angularDevkitSchematics.srcEngineInterfaceMod.FileOperator
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRulesTemplateMod {
  
  @JSImport("@angular-devkit/schematics/src/rules/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/schematics/src/rules/template", "InvalidPipeException")
  @js.native
  open class InvalidPipeException protected () extends BaseException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/rules/template", "OptionIsNotDefinedException")
  @js.native
  open class OptionIsNotDefinedException protected () extends BaseException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/rules/template", "TEMPLATE_FILENAME_RE")
  @js.native
  val TEMPLATE_FILENAME_RE: js.RegExp = js.native
  
  @JSImport("@angular-devkit/schematics/src/rules/template", "UnknownPipeException")
  @js.native
  open class UnknownPipeException protected () extends BaseException {
    def this(name: String) = this()
  }
  
  inline def applyContentTemplate[T](options: T): FileOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("applyContentTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[FileOperator]
  
  inline def applyPathTemplate[T /* <: PathTemplateData */](data: T): FileOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPathTemplate")(data.asInstanceOf[js.Any]).asInstanceOf[FileOperator]
  inline def applyPathTemplate[T /* <: PathTemplateData */](data: T, options: PathTemplateOptions): FileOperator = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPathTemplate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileOperator]
  
  inline def applyTemplates[T /* <: js.Object */](options: T): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTemplates")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def contentTemplate[T](options: T): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("contentTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def pathTemplate[T /* <: PathTemplateData */](options: T): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("pathTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def renameTemplateFiles(): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTemplateFiles")().asInstanceOf[Rule]
  
  inline def template[T /* <: js.Object */](options: T): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  trait PathTemplateData
    extends StObject
       with /* key */ StringDictionary[PathTemplateValue | PathTemplateData | PathTemplatePipeFunction]
  object PathTemplateData {
    
    inline def apply(): PathTemplateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathTemplateData]
    }
  }
  
  trait PathTemplateOptions extends StObject {
    
    var interpolationEnd: String
    
    var interpolationStart: String
    
    var pipeSeparator: js.UndefOr[String] = js.undefined
  }
  object PathTemplateOptions {
    
    inline def apply(interpolationEnd: String, interpolationStart: String): PathTemplateOptions = {
      val __obj = js.Dynamic.literal(interpolationEnd = interpolationEnd.asInstanceOf[js.Any], interpolationStart = interpolationStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathTemplateOptions]
    }
    
    extension [Self <: PathTemplateOptions](x: Self) {
      
      inline def setInterpolationEnd(value: String): Self = StObject.set(x, "interpolationEnd", value.asInstanceOf[js.Any])
      
      inline def setInterpolationStart(value: String): Self = StObject.set(x, "interpolationStart", value.asInstanceOf[js.Any])
      
      inline def setPipeSeparator(value: String): Self = StObject.set(x, "pipeSeparator", value.asInstanceOf[js.Any])
      
      inline def setPipeSeparatorUndefined: Self = StObject.set(x, "pipeSeparator", js.undefined)
    }
  }
  
  type PathTemplatePipeFunction = js.Function1[/* x */ String, PathTemplateValue]
  
  type PathTemplateValue = js.UndefOr[Boolean | String | Double]
}

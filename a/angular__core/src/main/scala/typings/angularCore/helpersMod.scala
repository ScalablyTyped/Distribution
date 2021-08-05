package typings.angularCore

import typings.angularCore.angularCoreStrings.AnyDuringRendererMigration
import typings.angularCore.angularCoreStrings.__ngRendererAnimateHelper
import typings.angularCore.angularCoreStrings.__ngRendererAttachViewAfterHelper
import typings.angularCore.angularCoreStrings.__ngRendererCreateElementHelper
import typings.angularCore.angularCoreStrings.__ngRendererCreateTemplateAnchorHelper
import typings.angularCore.angularCoreStrings.__ngRendererCreateTextHelper
import typings.angularCore.angularCoreStrings.__ngRendererDestroyViewHelper
import typings.angularCore.angularCoreStrings.__ngRendererDetachViewHelper
import typings.angularCore.angularCoreStrings.__ngRendererProjectNodesHelper
import typings.angularCore.angularCoreStrings.__ngRendererSetElementAttributeHelper
import typings.angularCore.angularCoreStrings.__ngRendererSplitNamespaceHelper
import typings.typescript.mod.Printer
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHelper(name: HelperFunction, sourceFile: SourceFile, printer: Printer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHelper")(name.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCore.angularCoreStrings.AnyDuringRendererMigration
    - typings.angularCore.angularCoreStrings.__ngRendererCreateElementHelper
    - typings.angularCore.angularCoreStrings.__ngRendererCreateTextHelper
    - typings.angularCore.angularCoreStrings.__ngRendererCreateTemplateAnchorHelper
    - typings.angularCore.angularCoreStrings.__ngRendererProjectNodesHelper
    - typings.angularCore.angularCoreStrings.__ngRendererAnimateHelper
    - typings.angularCore.angularCoreStrings.__ngRendererDestroyViewHelper
    - typings.angularCore.angularCoreStrings.__ngRendererDetachViewHelper
    - typings.angularCore.angularCoreStrings.__ngRendererAttachViewAfterHelper
    - typings.angularCore.angularCoreStrings.__ngRendererSplitNamespaceHelper
    - typings.angularCore.angularCoreStrings.__ngRendererSetElementAttributeHelper
  */
  trait HelperFunction extends StObject
  object HelperFunction {
    
    inline def animate: __ngRendererAnimateHelper = "__ngRendererAnimateHelper".asInstanceOf[__ngRendererAnimateHelper]
    
    inline def any: AnyDuringRendererMigration = "AnyDuringRendererMigration".asInstanceOf[AnyDuringRendererMigration]
    
    inline def attachViewAfter: __ngRendererAttachViewAfterHelper = "__ngRendererAttachViewAfterHelper".asInstanceOf[__ngRendererAttachViewAfterHelper]
    
    inline def createElement: __ngRendererCreateElementHelper = "__ngRendererCreateElementHelper".asInstanceOf[__ngRendererCreateElementHelper]
    
    inline def createTemplateAnchor: __ngRendererCreateTemplateAnchorHelper = "__ngRendererCreateTemplateAnchorHelper".asInstanceOf[__ngRendererCreateTemplateAnchorHelper]
    
    inline def createText: __ngRendererCreateTextHelper = "__ngRendererCreateTextHelper".asInstanceOf[__ngRendererCreateTextHelper]
    
    inline def destroyView: __ngRendererDestroyViewHelper = "__ngRendererDestroyViewHelper".asInstanceOf[__ngRendererDestroyViewHelper]
    
    inline def detachView: __ngRendererDetachViewHelper = "__ngRendererDetachViewHelper".asInstanceOf[__ngRendererDetachViewHelper]
    
    inline def projectNodes: __ngRendererProjectNodesHelper = "__ngRendererProjectNodesHelper".asInstanceOf[__ngRendererProjectNodesHelper]
    
    inline def setElementAttribute: __ngRendererSetElementAttributeHelper = "__ngRendererSetElementAttributeHelper".asInstanceOf[__ngRendererSetElementAttributeHelper]
    
    inline def splitNamespace: __ngRendererSplitNamespaceHelper = "__ngRendererSplitNamespaceHelper".asInstanceOf[__ngRendererSplitNamespaceHelper]
  }
}

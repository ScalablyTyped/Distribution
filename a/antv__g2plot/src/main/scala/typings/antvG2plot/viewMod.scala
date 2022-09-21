package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("@antv/g2plot/lib/utils/view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findViewById(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    id: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findViewById")(chart.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSiblingViews(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingViews")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ]]
  
  inline def getViews(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViews")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ]]
}

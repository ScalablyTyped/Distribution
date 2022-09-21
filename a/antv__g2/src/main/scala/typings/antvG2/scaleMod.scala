package typings.antvG2

import typings.antvG2.dependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.ScaleOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleMod {
  
  @JSImport("@antv/g2/lib/util/scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createScaleByField(field: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createScaleByField")(field.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createScaleByField(field: String, data: js.Array[Any | LooseObject]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createScaleByField")(field.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createScaleByField(field: String, data: js.Array[Any | LooseObject], scaleDef: ScaleOption): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createScaleByField")(field.asInstanceOf[js.Any], data.asInstanceOf[js.Any], scaleDef.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createScaleByField(field: String, data: Unit, scaleDef: ScaleOption): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createScaleByField")(field.asInstanceOf[js.Any], data.asInstanceOf[js.Any], scaleDef.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createScaleByField(field: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createScaleByField")(field.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createScaleByField(field: Double, data: js.Array[Any | LooseObject]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createScaleByField")(field.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createScaleByField(field: Double, data: js.Array[Any | LooseObject], scaleDef: ScaleOption): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createScaleByField")(field.asInstanceOf[js.Any], data.asInstanceOf[js.Any], scaleDef.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createScaleByField(field: Double, data: Unit, scaleDef: ScaleOption): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createScaleByField")(field.asInstanceOf[js.Any], data.asInstanceOf[js.Any], scaleDef.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDefaultCategoryScaleRange(
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    coordinate: Coordinate
  ): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale * / any['range'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCategoryScaleRange")(scale.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale * / any['range'] */ js.Any]
  inline def getDefaultCategoryScaleRange(
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    coordinate: Coordinate,
    theme: String
  ): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale * / any['range'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCategoryScaleRange")(scale.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale * / any['range'] */ js.Any]
  inline def getDefaultCategoryScaleRange(
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    coordinate: Coordinate,
    theme: LooseObject
  ): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale * / any['range'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCategoryScaleRange")(scale.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale * / any['range'] */ js.Any]
  
  inline def getMaxScale(
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getName(
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(scale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inferScaleType(
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    scaleDef: ScaleOption,
    attrType: String,
    geometryType: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inferScaleType")(scale.asInstanceOf[js.Any], scaleDef.asInstanceOf[js.Any], attrType.asInstanceOf[js.Any], geometryType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def syncScale(
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    newScale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncScale")(scale.asInstanceOf[js.Any], newScale.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

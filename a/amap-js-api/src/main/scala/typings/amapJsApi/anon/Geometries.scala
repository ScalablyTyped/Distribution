package typings.amapJsApi.anon

import typings.amapJsApi.amapJsApiStrings.GeometryCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometries
  extends StObject
     with typings.amapJsApi.AMap.GeoJSON.Geometry {
  
  var geometries: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
  ]
  
  var `type`: GeometryCollection
}
object Geometries {
  
  @scala.inline
  def apply(
    geometries: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
    ]
  ): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GeometryCollection")
    __obj.asInstanceOf[Geometries]
  }
  
  @scala.inline
  implicit class GeometriesMutableBuilder[Self <: Geometries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometries(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
        ]
    ): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object)*
    ): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    @scala.inline
    def setType(value: GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

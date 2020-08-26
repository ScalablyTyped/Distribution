package typings.amapJsApi.anon

import typings.amapJsApi.amapJsApiStrings.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometries
  extends typings.amapJsApi.AMap.GeoJSON.Geometry {
  var geometries: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
  ] = js.native
  var `type`: GeometryCollection = js.native
}

object Geometries {
  @scala.inline
  def apply(
    geometries: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
    ],
    `type`: GeometryCollection
  ): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometries]
  }
  @scala.inline
  implicit class GeometriesOps[Self <: Geometries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeometriesVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object)*
    ): Self = this.set("geometries", js.Array(value :_*))
    @scala.inline
    def setGeometries(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
        ]
    ): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GeometryCollection): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


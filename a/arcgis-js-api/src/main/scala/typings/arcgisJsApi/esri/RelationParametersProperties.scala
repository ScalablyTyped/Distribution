package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`interior-intersection`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-coincidence`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-touch`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-touch`
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.disjoint
import typings.arcgisJsApi.arcgisJsApiStrings.in_
import typings.arcgisJsApi.arcgisJsApiStrings.intersection
import typings.arcgisJsApi.arcgisJsApiStrings.overlap
import typings.arcgisJsApi.arcgisJsApiStrings.relation
import typings.arcgisJsApi.arcgisJsApiStrings.touch
import typings.arcgisJsApi.arcgisJsApiStrings.within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationParametersProperties extends js.Object {
  
  /**
    * The first array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries1)
    */
  var geometries1: js.UndefOr[js.Array[GeometryProperties]] = js.native
  
  /**
    * The second array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries2)
    */
  var geometries2: js.UndefOr[js.Array[GeometryProperties]] = js.native
  
  /**
    * The spatial relationship to be tested between the two input geometry arrays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relation)
    */
  var relation: js.UndefOr[
    cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | typings.arcgisJsApi.arcgisJsApiStrings.relation | touch | within
  ] = js.native
  
  /**
    * The string describes the spatial relationship to be tested when `RelationParameters.relation = 'relation'`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relationParameter)
    */
  var relationParameter: js.UndefOr[String] = js.native
}
object RelationParametersProperties {
  
  @scala.inline
  def apply(): RelationParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationParametersProperties]
  }
  
  @scala.inline
  implicit class RelationParametersPropertiesOps[Self <: RelationParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setGeometries1Varargs(value: GeometryProperties*): Self = this.set("geometries1", js.Array(value :_*))
    
    @scala.inline
    def setGeometries1(value: js.Array[GeometryProperties]): Self = this.set("geometries1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometries1: Self = this.set("geometries1", js.undefined)
    
    @scala.inline
    def setGeometries2Varargs(value: GeometryProperties*): Self = this.set("geometries2", js.Array(value :_*))
    
    @scala.inline
    def setGeometries2(value: js.Array[GeometryProperties]): Self = this.set("geometries2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometries2: Self = this.set("geometries2", js.undefined)
    
    @scala.inline
    def setRelation(
      value: cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | relation | touch | within
    ): Self = this.set("relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelation: Self = this.set("relation", js.undefined)
    
    @scala.inline
    def setRelationParameter(value: String): Self = this.set("relationParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationParameter: Self = this.set("relationParameter", js.undefined)
  }
}

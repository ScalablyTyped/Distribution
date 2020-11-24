package typings.allTheCities.mod

import typings.allTheCities.allTheCitiesStrings.PPL
import typings.allTheCities.allTheCitiesStrings.PPLA
import typings.allTheCities.allTheCitiesStrings.PPLA2
import typings.allTheCities.allTheCitiesStrings.PPLA3
import typings.allTheCities.allTheCitiesStrings.PPLA4
import typings.allTheCities.allTheCitiesStrings.PPLA5
import typings.allTheCities.allTheCitiesStrings.PPLC
import typings.allTheCities.allTheCitiesStrings.PPLCH
import typings.allTheCities.allTheCitiesStrings.PPLF
import typings.allTheCities.allTheCitiesStrings.PPLG
import typings.allTheCities.allTheCitiesStrings.PPLH
import typings.allTheCities.allTheCitiesStrings.PPLL
import typings.allTheCities.allTheCitiesStrings.PPLQ
import typings.allTheCities.allTheCitiesStrings.PPLR
import typings.allTheCities.allTheCitiesStrings.PPLS
import typings.allTheCities.allTheCitiesStrings.PPLW
import typings.allTheCities.allTheCitiesStrings.PPLX
import typings.allTheCities.allTheCitiesStrings.STLMT
import typings.allTheCities.anon.Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllTheCitiesCity extends js.Object {
  
  var adminCode: String = js.native
  
  var altName: String = js.native
  
  var cityId: Double = js.native
  
  var country: String = js.native
  
  var featureCode: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT = js.native
  
  var loc: Coordinates = js.native
  
  var name: String = js.native
  
  var population: Double = js.native
}
object AllTheCitiesCity {
  
  @scala.inline
  def apply(
    adminCode: String,
    altName: String,
    cityId: Double,
    country: String,
    featureCode: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT,
    loc: Coordinates,
    name: String,
    population: Double
  ): AllTheCitiesCity = {
    val __obj = js.Dynamic.literal(adminCode = adminCode.asInstanceOf[js.Any], altName = altName.asInstanceOf[js.Any], cityId = cityId.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], featureCode = featureCode.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], population = population.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllTheCitiesCity]
  }
  
  @scala.inline
  implicit class AllTheCitiesCityOps[Self <: AllTheCitiesCity] (val x: Self) extends AnyVal {
    
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
    def setAdminCode(value: String): Self = this.set("adminCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltName(value: String): Self = this.set("altName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityId(value: Double): Self = this.set("cityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureCode(
      value: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT
    ): Self = this.set("featureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Coordinates): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopulation(value: Double): Self = this.set("population", value.asInstanceOf[js.Any])
  }
}

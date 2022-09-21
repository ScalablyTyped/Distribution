package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorConstructor
  extends StObject
     with /**
  * Error is a class that enhances the debugging and error handling process.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html)
  */
Instantiable1[/* name */ String, Error]
     with Instantiable2[/* name */ String, /* message */ String, Error]
     with Instantiable3[
      /* name */ String, 
      (/* message */ String) | (/* message */ scala.Unit), 
      /* details */ Any, 
      Error
    ]

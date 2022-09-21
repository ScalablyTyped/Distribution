package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.awsDots3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var source: awsDots3
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal(source = "aws.s3")
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSource(value: awsDots3): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
